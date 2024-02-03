package StructuralDesignPatterns.FacadeDesignPattern.Example01;

public class VideoPlayer {
    public void turnOn(){
        System.out.println("Turn On VideoPlayer");
    }
    public void play(String video){
        System.out.println("playing "+video);
    }
    public void turnOff(){
        System.out.println("Turn off VideoPlayer");
    }
}
