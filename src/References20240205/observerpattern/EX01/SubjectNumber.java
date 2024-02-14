package References20240205.observerpattern.EX01;

import java.util.ArrayList;
import java.util.List;

public class SubjectNumber {
    private List<ObserverNumberType> observerNumberTypeList=new ArrayList<ObserverNumberType>();

    private static int state;

    public void setState(int state) {
        this.state = state;
    }

    public  int getState() {
        return state;
    }

    public void attach(ObserverNumberType ob){

        observerNumberTypeList.add(ob);
    }
    public void notifyAllObservers(){

        for(ObserverNumberType ob:observerNumberTypeList){
            ob.update();
        }

    }
}
