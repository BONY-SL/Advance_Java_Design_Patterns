package References20240205.Strategy.EX03;

import References20240205.Strategy.EX01.FastAndDirtyConcreate;

public class ShortContex {
    private static ShortStrategy shortStrategy;

    int[] arry={5,3,2,78,0,9};

    public ShortContex(ShortStrategy shortStrategy) {

        this.shortStrategy = shortStrategy;
    }

    public static ShortStrategy getShortStrategy() {
        return shortStrategy;
    }

    public void shortArray(){
        if(shortStrategy==null){
            System.out.println("Object is null");
        }
        else {
            shortStrategy.shortArray(arry);
        }
    }

    public void UpdateToFast(){

        if(!(shortStrategy instanceof FastShort) ){
            System.out.println("Updating to FastShort");
            shortStrategy=new FastShort();
        }
        else {

            System.out.println("Already Running FastShort");
        }
    }

    public void UpdateToBubble(){

        if(!(shortStrategy instanceof BubbleShort) ){
            System.out.println("Updating to BubbleShort");
            shortStrategy=new BubbleShort();
        }
        else {

            System.out.println("Already Running BubbleShort");
        }
    }

    public void UpdateToSelection(){

        if(!(shortStrategy instanceof SelectionShort) ){
            System.out.println("Updating to SelectionShort");
            shortStrategy=new SelectionShort();
        }
        else {

            System.out.println("Already Running SelectionShort");
        }
    }




}
