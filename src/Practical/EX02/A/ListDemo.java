package Practical.EX02.A;

public class ListDemo {
    public static void main(String[] args) {

        ListFactory lf=new ListFactory();

        List l=lf.getList("MyList");
        l.speedTest();

    }
}
