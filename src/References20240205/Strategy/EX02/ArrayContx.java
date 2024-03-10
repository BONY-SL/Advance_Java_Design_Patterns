package References20240205.Strategy.EX02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayContx {
    private ArrayStrategy arrayStrategy;

    private int[] data;

    public ArrayContx(ArrayStrategy arrayStrategy) {
        this.arrayStrategy = arrayStrategy;
    }

    public void readFile() throws FileNotFoundException {

        File file=new File("D:\\UNIVERSITY OF RUHUNA BICT_SE\\ACADAMIC\\LEVEL 3\\SEMESTER 1\\Advanced Programming\\week 01\\DesignPatterns\\Advance_Java_Design_Patterns\\src\\References20240205\\Strategy\\EX02\\data.txt");
        Scanner scanner=new Scanner(file);

        String line=scanner.nextLine();

        String[] number= line.split(",");

        data=new int[number.length];

        for (int i = 0; i < data.length; i++) {

            this.data[i] = Integer.parseInt(number[i].trim());
        }

        scanner.close();

    }

    public void presentArray(){
        if(arrayStrategy==null || data==null){
            System.out.println("Object is Null Or Array is Null");
        }else {
            arrayStrategy.presentArray(data);
        }

    }


    public void downbreak(){
        if(!(arrayStrategy instanceof ArrayRepresent)){
            arrayStrategy=new ArrayRepresent();
        }
    }

    public void update(){

        System.out.println("Updating BarChart Represent.........");
        if(!(arrayStrategy instanceof BarChartRepresent)){
            arrayStrategy=new BarChartRepresent();
        }
    }

}
