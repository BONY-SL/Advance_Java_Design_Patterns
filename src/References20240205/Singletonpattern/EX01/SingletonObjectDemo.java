package References20240205.Singletonpattern.EX01;

public class SingletonObjectDemo {
    public static void main(String[] args) {
        SingletonObject obj=SingletonObject.getSingletonObject();
        obj.showMessage();
    }
}
