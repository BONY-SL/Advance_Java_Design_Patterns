package BehaviralDesignPatterns.CommandDesignPattern.Example2;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem() {

        String osName = System.getProperty("os.name");

        System.out.println("Underlying OS is: " + osName);

        if (osName.contains("Windows")) {
            return new Windows();
        } else {
            return new Unix();
        }
    }
}
