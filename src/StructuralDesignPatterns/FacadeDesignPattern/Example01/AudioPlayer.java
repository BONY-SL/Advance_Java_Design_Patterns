package StructuralDesignPatterns.FacadeDesignPattern.Example01;

public class AudioPlayer {
    public void turnOn(){

        System.out.println("Turn On AudioPlayer");

    }
    public void play(String audio){
        System.out.println("Playing "+audio);
    }
    public void turnOff(){
        System.out.println("Turn off AudioPlayer");
    }
}
