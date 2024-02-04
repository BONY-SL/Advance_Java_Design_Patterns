package BehaviralDesignPatterns.CommandDesignPattern;

public class TurnOnCommand implements Command{

    private Device device;
    @Override
    public void execute() {
        device.turnOn();
    }

    public TurnOnCommand(Device device) {
        this.device = device;
    }


}
