package BehaviralDesignPatterns.CommandDesignPattern.Example2;

public class Windows implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening file in windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in windows OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Windows OS");
    }
}
