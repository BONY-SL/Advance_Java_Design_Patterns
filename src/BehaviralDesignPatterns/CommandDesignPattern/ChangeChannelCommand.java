package BehaviralDesignPatterns.CommandDesignPattern;

public class ChangeChannelCommand implements Command{
    @Override
    public void execute() {
        tv.changeChannel();
    }

    private TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

}
