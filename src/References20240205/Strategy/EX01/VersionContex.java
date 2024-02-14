package References20240205.Strategy.EX01;

public  class VersionContex {

    private PowerCalculaterStrategy powerCalculaterStrategy;

    public VersionContex(PowerCalculaterStrategy powerCalculaterStrategy) {
        this.powerCalculaterStrategy = powerCalculaterStrategy;
    }


    public double calculate(double base,double exp) throws IllegalAccessException {
        if (powerCalculaterStrategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return powerCalculaterStrategy.calculate(base,exp);
    }

    public void upgrade() {
        if (!(powerCalculaterStrategy instanceof FastAndDirtyConcreate)) {
            System.out.println();
            System.out.println("Upgrading strategy to FastAndDirty");
            powerCalculaterStrategy = new FastAndDirtyConcreate();
        } else {
            System.out.println("Already using QuickAndDirty strategy");
        }
    }

    public void downgrade() {
        if (!(powerCalculaterStrategy instanceof StepByStepConcrete)) {
            System.out.println();
            System.out.println("Downgrading strategy to StepByStep");
            powerCalculaterStrategy = new StepByStepConcrete();
        } else {
            System.out.println("Already using StepByStep strategy");
        }
    }
}
