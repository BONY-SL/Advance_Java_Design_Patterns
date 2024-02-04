package BehaviralDesignPatterns.CommandDesignPattern.Example2;

public class OpenFileCommand implements FileCommand{

    private FileSystemReceiver filesystem;

    public OpenFileCommand(FileSystemReceiver filesystem) {
        this.filesystem = filesystem;
    }

    @Override
    public void execute() {
        filesystem.openFile();
    }
}
