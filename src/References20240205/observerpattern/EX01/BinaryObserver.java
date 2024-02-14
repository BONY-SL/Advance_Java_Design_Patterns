package References20240205.observerpattern.EX01;

public class BinaryObserver extends ObserverNumberType {

    protected SubjectNumber subjectNumber;

    public BinaryObserver(SubjectNumber sub) {
        this.subjectNumber=sub;
        this.subjectNumber.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subjectNumber.getState()));

    }
}
