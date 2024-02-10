package BehaviralDesignPatterns.ObserverDesignPattern;

public class ObserverDemo {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        Obsever phoneDisplay = new PhoneDisplay();
        Obsever tvDisplay = new TVDisplay();

        weatherStation.RegisterObserver(phoneDisplay);
        weatherStation.RegisterObserver(tvDisplay);

        weatherStation.setWeather("Sunny");
        
    }
}
