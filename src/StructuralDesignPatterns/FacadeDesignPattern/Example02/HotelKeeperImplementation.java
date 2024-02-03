package StructuralDesignPatterns.FacadeDesignPattern.Example02;

public class HotelKeeperImplementation implements HotelKeeper{
    @Override
    public VegMenu getVegMenu() {

        VegRestaurant v = new VegRestaurant();
        VegMenu vegMenu = (VegMenu)v.getMenus();
        return vegMenu;
    }

    @Override
    public NonVegMenu getNonVegMenu() {

        NonVegResturant v = new NonVegResturant();
        NonVegMenu NonvegMenu = (NonVegMenu)v.getMenus();
        return NonvegMenu;
    }

    @Override
    public BothMenu getVegNonMenu() {

        VegNonBothRestaurant v = new VegNonBothRestaurant();
        BothMenu bothMenu = (BothMenu)v.getMenus();
        return bothMenu;
    }
}
