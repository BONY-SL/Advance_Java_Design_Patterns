package References20240205.Strategy.EX03;

public class BubbleShort extends ShortStrategy{
    @Override
    public void shortArray(int[] array) {

        System.out.println("Selected BubbleShort");

        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {

                    //swap temp and arr[i]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
        System.out.println();
    }
}
