package BehaviralDesignPatterns.CommandDesignPattern.Example2;

public class FileInvoker {
   private FileCommand fc;

    public FileInvoker(FileCommand c) {
        this.fc = c;
    }

    public void execute() {
        this.fc.execute();
    }
}
