package References20240205.CommandPattern.Ex02;

public class DrawRectangle implements CommandDrow{
    ShapeDrower shapeDrower;

    public DrawRectangle(ShapeDrower shapeDrower) {
        this.shapeDrower = shapeDrower;
    }


    @Override
    public void execute() {
        shapeDrower.drowRectangle();
    }
}
