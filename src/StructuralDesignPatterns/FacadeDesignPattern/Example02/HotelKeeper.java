package StructuralDesignPatterns.FacadeDesignPattern.Example02;

public interface HotelKeeper {
    public VegMenu getVegMenu();
    public NonVegMenu getNonVegMenu();
    public BothMenu getVegNonMenu();
}
