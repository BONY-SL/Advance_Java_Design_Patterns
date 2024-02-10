package References20240205.factory.EX02;

import java.util.Scanner;

public class CakeTest {
    public static void main(String[] args) {


        Cake cake = null;

        System.out.print("Which Cake you would like to eat BlackForest/BlueBerry/LitchiGateaux/Pineapple : ");


        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        scanner.close();

        CakeFactory cakeFactory=new CakeFactory();
        cake=cakeFactory.createCake(choice);
        System.out.println();
        cake.aboutCake();

        System.out.println();
        cake.recipe();

        System.out.println();
        cake.myFan();

    }
}
