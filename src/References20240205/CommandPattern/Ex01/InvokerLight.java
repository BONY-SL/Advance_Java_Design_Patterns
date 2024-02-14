package References20240205.CommandPattern.Ex01;

public class InvokerLight {
    private CommandLight command;

    public void setCommand(CommandLight command) {
        this.command = command;
    }

    public void passButton(){
        command.execute();
    }
}
