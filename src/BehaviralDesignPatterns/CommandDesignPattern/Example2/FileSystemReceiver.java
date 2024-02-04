package BehaviralDesignPatterns.CommandDesignPattern.Example2;

public interface FileSystemReceiver {

    void openFile();
    void writeFile();
    void closeFile();
}
