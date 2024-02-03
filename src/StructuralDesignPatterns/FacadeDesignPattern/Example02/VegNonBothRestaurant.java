package StructuralDesignPatterns.FacadeDesignPattern.Example02;

public class VegNonBothRestaurant implements Hotel{
    @Override
    public Menus getMenus() {
        BothMenu bm=new BothMenu();
        return bm;
    }
}
