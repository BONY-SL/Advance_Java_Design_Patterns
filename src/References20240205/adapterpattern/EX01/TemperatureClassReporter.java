package References20240205.adapterpattern.EX01;

public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo{

    @Override
    public double getTemperatureInF() {


        return cToF(temperatureInC);
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        this.temperatureInC = fToC(temperatureInF);
    }

    @Override
    public double getTemperatureInC() {

        return temperatureInC;

    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        this.temperatureInC = temperatureInC;

    }



    private double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }
    private double cToF(double c) {
        return ((c * 9 / 5) + 32);
    }
}
