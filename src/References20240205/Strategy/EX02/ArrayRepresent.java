package References20240205.Strategy.EX02;

public class ArrayRepresent extends ArrayStrategy{
    @Override
    public void presentArray(int[] data) {

        System.out.print("{");
        for (int i=0;i< data.length;i++){

            if(i+1==data.length-1)
            {
                System.out.print("("+(i+1)+","+data[i]+"),");
            }else {
                System.out.print("(" + (i + 1) + "," + data[i] + ")");
            }
        }
        System.out.print("}");
    }
}
