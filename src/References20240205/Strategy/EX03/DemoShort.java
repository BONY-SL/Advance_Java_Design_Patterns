package References20240205.Strategy.EX03;

public class DemoShort {
    public static void main(String[] args) {


            ShortContex shot=new ShortContex(new BubbleShort());
            shot.shortArray();
            ShortStrategy st=ShortContex.getShortStrategy();


            if(st instanceof FastShort){

                System.out.println();
                shot.UpdateToBubble();
                shot.shortArray();

                System.out.println();
                shot.UpdateToSelection();
                shot.shortArray();
                System.out.println("IF one Executed");

            }else if(st instanceof BubbleShort){
                System.out.println();
                shot.UpdateToSelection();
                shot.shortArray();

                System.out.println();
                shot.UpdateToFast();
                shot.shortArray();
                System.out.println("IF two Executed");

            } else if (st instanceof SelectionShort) {

                System.out.println();
                shot.UpdateToFast();
                shot.shortArray();

                System.out.println();
                shot.UpdateToBubble();
                shot.shortArray();
                System.out.println("IF three Executed");
            }
    }
}
