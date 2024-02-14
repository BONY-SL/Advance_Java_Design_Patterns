package References20240205.Strategy.EX02;
public class BarChartRepresent extends ArrayStrategy {
    @Override
    public void presentArray(int[] data) {

        for(int i=0;i< data.length;i++){

            System.out.print(i+1+": ");
            for(int a=0;a<data[i];a++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
