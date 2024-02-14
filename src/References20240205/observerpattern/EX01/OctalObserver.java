package References20240205.observerpattern.EX01;

public class OctalObserver extends ObserverNumberType{

    protected SubjectNumber subjectNumber;
    public OctalObserver(SubjectNumber sub) {
        this.subjectNumber=sub;
        this.subjectNumber.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subjectNumber.getState()));
    }
}
