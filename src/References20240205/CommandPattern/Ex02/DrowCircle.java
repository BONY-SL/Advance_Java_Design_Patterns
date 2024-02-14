package References20240205.CommandPattern.Ex02;

public class DrowCircle implements CommandDrow{

    ShapeDrower shapeDrower;

    @Override
    public void execute() {
        shapeDrower.drowCircle();
    }

    public DrowCircle(ShapeDrower shapeDrower) {
        this.shapeDrower = shapeDrower;
    }
}
