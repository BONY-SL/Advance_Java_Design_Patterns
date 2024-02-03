package StructuralDesignPatterns.FacadeDesignPattern.Example02;

public class NonVegResturant implements Hotel{
    @Override
    public Menus getMenus() {

        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}
