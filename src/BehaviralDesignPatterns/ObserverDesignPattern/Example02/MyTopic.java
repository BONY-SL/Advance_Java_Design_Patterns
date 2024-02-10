package BehaviralDesignPatterns.ObserverDesignPattern.Example02;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements SubjectE2{

    private List<ObserverE2> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers=new ArrayList<>();
    }

    @Override
    public void register(ObserverE2 obj) {
        if(obj==null)throw  new NullPointerException("Null Observer");
        synchronized (MUTEX){
            if(!observers.contains(obj))observers.add((ObserverE2) obj);
        }
    }

    @Override
    public void unregister(ObserverE2 obj) {
        synchronized (MUTEX){
            observers.remove(obj);
        }
    }

    @Override
    public void notifyOb() {
        List<ObserverE2> observersLocal = null;
        synchronized (MUTEX) {
            if (!changed)
                return;
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (ObserverE2 obj : observersLocal) {
            obj.updateE2();
        }
    }

    @Override
    public Object getUpdate(ObserverE2 obj) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message Posted to Topic:" + msg);
        this.message = msg;
        this.changed = true;
        notifyOb();
    }
}
