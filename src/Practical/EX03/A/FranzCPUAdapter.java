package Practical.EX03.A;

public class FranzCPUAdapter implements Part{

    private FranzCPU franzCPU;

    public FranzCPUAdapter(FranzCPU franzCPU) {
        this.franzCPU = franzCPU;
    }

    @Override
    public void performFunction() {
        franzCPU.performFranzCPUFunction();
    }
}
