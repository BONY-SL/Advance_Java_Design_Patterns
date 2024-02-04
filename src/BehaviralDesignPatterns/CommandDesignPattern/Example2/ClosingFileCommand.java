package BehaviralDesignPatterns.CommandDesignPattern.Example2;

public class ClosingFileCommand implements FileCommand{

    private FileSystemReceiver filesystem;

    public ClosingFileCommand(FileSystemReceiver filesystem) {
        this.filesystem = filesystem;
    }

    @Override
    public void execute() {
        filesystem.closeFile();
    }
}
