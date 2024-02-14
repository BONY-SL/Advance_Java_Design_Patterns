package References20240205.observerpattern.EX01;

public class HexaObserver extends ObserverNumberType{

    protected SubjectNumber subjectNumber;
    public HexaObserver(SubjectNumber sub) {
        this.subjectNumber=sub;
        this.subjectNumber.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subjectNumber.getState()).toUpperCase() );
    }
}
