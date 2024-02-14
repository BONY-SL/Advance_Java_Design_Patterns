package References20240205.CommandPattern.Ex02;

public class DrowDemo {
    public static void main(String[] args) {

        ShapeDrower drower=new ShapeDrower();
        CommandDrow rectangke=new DrawRectangle(drower);
        CommandDrow circlr=new DrowCircle(drower);

        DrowInvoker invoker=new DrowInvoker();
        invoker.addCommand(rectangke);
        invoker.addCommand(circlr);


        invoker.executeCommands();

    }
}
