package References20240205.observerpattern.EX01;

public class ObserverPatternDemo {

    public static void main(String[] args) {

        SubjectNumber sb=new SubjectNumber();
        new HexaObserver(sb);
        new OctalObserver(sb);
        new BinaryObserver(sb);
        
        sb.setState(10);
        sb.notifyAllObservers();

    }
}
