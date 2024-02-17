package Practical.EX03.A;

public class PartDemo {
    public static void main(String[] args) {

        Part myCPU = new CPU();
        Part myHardDisk = new HardDisk();
        Part myCDROM = new CDROM();

        Part franzCPU = new FranzCPUAdapter(new FranzCPU());
        Part franzHardDisk = new FranzHardDiskAdapter(new FranzHardDisk());


        myCPU.performFunction();
        myHardDisk.performFunction();
        myCDROM.performFunction();

        franzCPU.performFunction();
        franzHardDisk.performFunction();
    }
}
