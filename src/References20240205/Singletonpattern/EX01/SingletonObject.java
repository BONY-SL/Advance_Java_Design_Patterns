package References20240205.Singletonpattern.EX01;

public class SingletonObject {
    private static SingletonObject singletonObject=null;

    private SingletonObject() {

    }

    public static SingletonObject getSingletonObject(){
        if(singletonObject==null) {
            singletonObject = new SingletonObject();
        }
        return singletonObject;

    }
    public void showMessage(){
        System.out.println("Create Singleton Instance");
    }
}
