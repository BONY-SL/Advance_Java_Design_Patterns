package References20240205.CommandPattern.Ex01;

import BehaviralDesignPatterns.CommandDesignPattern.Command;

public class CommandDemo {

    public static void main(String[] args) {

        InvokerLight invokerLight = new InvokerLight();
        Light light = new Light();

        CommandLight lighton = new TurnOnLight(light);
        invokerLight.setCommand(lighton);
        invokerLight.passButton();
        System.out.println(Light.isOn());


        CommandLight lightOff=new TurnOffLight(light);
        invokerLight.setCommand(lightOff);
        invokerLight.passButton();
        System.out.println(Light.isOn());
    }

}