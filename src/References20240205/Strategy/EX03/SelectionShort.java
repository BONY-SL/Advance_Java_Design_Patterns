package References20240205.Strategy.EX03;

public class SelectionShort extends ShortStrategy{
    @Override
    public void shortArray(int[] array) {


        System.out.println("Selected SelectionShort");

        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
        System.out.println();

    }
}
