package BehaviralDesignPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.*;

public class WeatherStation implements Subject{
    private final List<Obsever> obseverList=new ArrayList<>();
    private String weather;
    @Override
    public void RegisterObserver(Obsever obsever) {
        obseverList.add(obsever);
    }

    @Override
    public void UnRegisterObserver(Obsever observer) {
        obseverList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Obsever obsever:obseverList){
            obsever.update(weather);
        }
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }
}
