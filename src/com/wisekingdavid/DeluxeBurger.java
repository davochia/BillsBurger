package com.wisekingdavid;

public class DeluxeBurger extends HamBurger{
    public DeluxeBurger(double price, String breadType, String meatType) {
        super("Deluxe Burger", price, breadType, meatType);
    }

    private void addChips(){
        System.out.println("Chips added to menu");
    }
    private void addDrinks(){
        System.out.println("Drinks added to menu");
    }

    @Override
    public void meatChoice(String meatChoice) {
        super.meatChoice(meatChoice);
    }

    @Override
    public void breadChoice(String breadChoice) {
        super.breadChoice(breadChoice);
    }

    @Override
    public void makeBurger() {
        addChips();
        addDrinks();
        super.makeBurger();
    }
}
