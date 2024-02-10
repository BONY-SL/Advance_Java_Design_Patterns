package BehaviralDesignPatterns.ObserverDesignPattern;

public class PhoneDisplay implements Obsever{

    private String weather;

    @Override
    public void update(String weather) {
        this.weather=weather;
        display();
    }

    private void display(){
        System.out.println("Phone Display: Weather updated - " + weather);
    }
}
