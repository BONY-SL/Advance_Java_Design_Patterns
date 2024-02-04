package BehaviralDesignPatterns.CommandDesignPattern.Example2;

public class WritingFileCommand implements FileCommand{

    private FileSystemReceiver filesystem;

    public WritingFileCommand(FileSystemReceiver filesystem) {
        this.filesystem = filesystem;
    }

    @Override
    public void execute() {
        filesystem.writeFile();
    }

}
