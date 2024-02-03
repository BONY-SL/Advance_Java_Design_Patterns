package StructuralDesignPatterns.FacadeDesignPattern.Example02;

public class Demo {
    public static void main (String[] args)
    {
        HotelKeeper keeper = new HotelKeeperImplementation();

        VegMenu v = keeper.getVegMenu();
        v.menus();
        //NonVegMenu nv = keeper.getNonVegMenu();
        //BothMenu b=keeper.getVegNonMenu();

    }
}
