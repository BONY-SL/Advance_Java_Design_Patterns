package References20240205.Strategy.EX01;

public class FastAndDirtyConcreate extends PowerCalculaterStrategy{
    @Override
    public double calculate(double base, double power) throws IllegalAccessException {

        System.out.println("Selected FastAndDirtyConcreate");
        if(isInteger(power)){

            return Math.pow(base, power);
        }else {
            throw new IllegalAccessException("StepByStep strategy only supports integer exponents.");
        }
    }
}
