package Practical.EX03.A;

public class FranzHardDiskAdapter implements Part{

    private FranzHardDisk franzHardDisk;

    public FranzHardDiskAdapter(FranzHardDisk franzHardDisk) {
        this.franzHardDisk = franzHardDisk;
    }

    @Override
    public void performFunction() {
        franzHardDisk.performFranzHardDiskFunction();
    }
}
