package References20240205.CommandPattern.Ex01;

public class TurnOffLight implements CommandLight {

    Light light;
    @Override
    public void execute() {
        light.switchOff();
    }

    public TurnOffLight(Light light) {
        this.light = light;
    }


}
