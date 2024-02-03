package StructuralDesignPatterns.FacadeDesignPattern.Example02;

public class VegRestaurant implements Hotel{
    @Override
    public Menus getMenus() {
        VegMenu vm=new VegMenu();
        return vm;
    }
}
