package References20240205.CommandPattern.Ex01;

public class Light {

    private static boolean on;
    public void switchOn() {
        on=true;
    }

    public void switchOff() {
        on=false;
    }

    public static boolean isOn() {
        return on;
    }
}
