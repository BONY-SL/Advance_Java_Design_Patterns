package BehaviralDesignPatterns.ObserverDesignPattern.Example02;

import BehaviralDesignPatterns.ObserverDesignPattern.Obsever;

public interface SubjectE2 {
    void register(ObserverE2 obj);
    void unregister(ObserverE2 obj);
    void notifyOb();
    Object getUpdate(ObserverE2 obj);

}
