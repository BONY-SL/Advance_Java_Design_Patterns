package References20240205.CommandPattern.Ex01;

public class TurnOnLight implements CommandLight {
    @Override
    public void execute() {
        light.switchOn();
    }

    public TurnOnLight(Light light) {

        this.light = light;
    }

    Light light;

}
