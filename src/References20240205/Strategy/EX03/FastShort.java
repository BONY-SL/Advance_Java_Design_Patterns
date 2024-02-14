package References20240205.Strategy.EX03;

import java.util.Arrays;

public class FastShort extends ShortStrategy{
    @Override
    public void shortArray(int[] array) {

        System.out.println("Selected FastShort");
        Arrays.sort(array);

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
        System.out.println();

    }
}
