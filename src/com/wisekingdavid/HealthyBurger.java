package com.wisekingdavid;

public class HealthyBurger extends HamBurger {
    private double newTotalPrice;
    private String newMeat = super.getMeatType();
    private String newBread = super.getBreadType();

    public HealthyBurger(double price, String meatType) {
        super("Vegan Burger", price, "Brown rye bread roll", meatType);
    }

    public void addGarlicCream(){
        System.out.println("Garlic was added to " + getClass().getSimpleName() +"...Price = " + 1.50 + "$");
          this.newTotalPrice = super.getPrice() + 1.50;
    }

    public void addGingerCream(){
        System.out.println("Ginger was added to " + getClass().getSimpleName() +"...Price = " + 2.20 + "$");
        this.newTotalPrice = super.getPrice() + 2.20;
    }

    @Override
    public void meatChoice(String meatChoice) {
        if (meatChoice.equalsIgnoreCase("Green")){
            this.newMeat = meatChoice + " meat selected";
        }else if (meatChoice.equalsIgnoreCase("Mushroom")){
            this.newMeat = meatChoice + " meat selected";
        }else {
            System.out.println("No meat added");;
        }
    }

    @Override
    public void breadChoice(String breadChoice) {
        if (breadChoice.equalsIgnoreCase("Roll")){
            this.newBread = breadChoice + " vegan bread selected";
        }else if (breadChoice.equalsIgnoreCase("Normal")){
            this.newBread = breadChoice + " vegan bread selected";
        }else{
            System.out.println("No bread added...");
        }
    }

    @Override
    public void makeBurger() {
        //super.makeBurger();
        System.out.println("Bread choice: " + this.newBread + "\n" +
                "Meat choice: " + this.newMeat + "\n" + "vegetables and cream." + "\n" +
                "Total price = " + this.newTotalPrice + "$\n" +
                "Bon appetit!");

        System.out.println("------------------" + getClass().getSimpleName() +"-----------------------");
        System.out.println();
    }
}
