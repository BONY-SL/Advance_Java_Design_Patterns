package References20240205.Strategy.EX02;

import java.io.FileNotFoundException;

public class DemoExample {
    public static void main(String[] args) throws FileNotFoundException {


        ArrayContx ar=new ArrayContx(new ArrayRepresent());
        ar.readFile();
        ar.presentArray();

        System.out.println();
        System.out.println();


        ArrayContx ar2=new ArrayContx(new BarChartRepresent());
        ar2.readFile();
        ar2.presentArray();
    }
}
