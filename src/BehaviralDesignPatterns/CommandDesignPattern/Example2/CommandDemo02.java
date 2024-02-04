package BehaviralDesignPatterns.CommandDesignPattern.Example2;

public class CommandDemo02 {
    public static void main(String[] args) {

        // Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        // Creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        // Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);
        // Perform action on invoker object
        file.execute();

        WritingFileCommand writeFileCommand = new WritingFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        ClosingFileCommand closeFileCommand = new ClosingFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
