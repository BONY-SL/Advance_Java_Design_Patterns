package StructuralDesignPatterns.FacadeDesignPattern.Example02;

public class BothMenu extends Menus{

    @Override
    public void menus() {
        System.out.println("Menu 1: "+"Normal Rice,Dhal");
        System.out.println("Menu 2: "+"Normal Rice,Sambola");
        System.out.println("Menu 3: "+"Checken Rice,Egges");
        System.out.println("Menu 4: "+"Fish Rice,sosages");
    }
}
