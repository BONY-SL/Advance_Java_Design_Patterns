package Practical.EX02.B;

public class DemoCompiler {
    public static void main(String[] args) {


        CompierFacade cp=new CompierFacade();

        System.out.println(cp.compile("12345"));
    }
}
