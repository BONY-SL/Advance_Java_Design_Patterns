package References20240205.Strategy.EX01;

public class StepByStepConcrete extends PowerCalculaterStrategy{
    @Override
    public double calculate(double base, double power) throws IllegalAccessException {

        System.out.println("Selected StepByStepConcrete");
        if(isInteger(power)){
            double result = 1;
            for (int i = 0; i < power; i++) {
                result *= base;
            }
            return result;
        }else {
            throw new IllegalAccessException("StepByStep strategy only supports integer exponents.");
        }
    }


}
