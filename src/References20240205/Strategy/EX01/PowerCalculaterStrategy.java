package References20240205.Strategy.EX01;

public abstract class PowerCalculaterStrategy {

    abstract public double calculate(double base,double power) throws IllegalAccessException;

    public boolean isInteger(double number){

        return number == Math.floor(number)&& !Double.isInfinite(number);
    }
}
