package com.wisekingdavid;

public class HamBurger  {
    private String name;
    private double price;
    private String breadType;
    private String meatType;

    public HamBurger(String name, double price, String breadType, String meatType) {
        this.name = name;
        this.price = price;
        this.breadType = breadType;
        this.meatType = meatType;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void addLettuce(){
        System.out.println("Lettuce was added to " + getClass().getSimpleName() +"... Price = " + .90 + "$");
        this.price += .90;
    }

    public void addTomatoes(){
        System.out.println("Tomatoes was added to " + getClass().getSimpleName() +"...Price = " + .50 + "$");
        this.price += .50;
    }

    public void addCarrot(){
        System.out.println("Carrot was added to " + getClass().getSimpleName() +"...Price = " + 1.20 + "$");
        this.price  += 1.20;
    }
    public void addCucumber(){
        System.out.println("Cucumber was added to " + getClass().getSimpleName() +"...Price = " + 1.00 + "$");
        this.price += 1;
    }

    public void meatChoice(String meatChoice){
        if (meatChoice.equalsIgnoreCase("Chicken")){
            this.meatType = meatChoice + "meat selected";
        }else if (meatChoice.equalsIgnoreCase("Beef")){
            this.meatType = meatChoice + " meat selected";
        }else {
            System.out.println("No meat selected...");
        }
    }

    public void breadChoice(String breadChoice){
        if (breadChoice.equalsIgnoreCase("Roll")){
            this.breadType = breadChoice + " bread selected";
        }else if (breadChoice.equalsIgnoreCase("Normal")){
            this.breadType = breadChoice + " burger bread selected";
        }else{
            System.out.println("No bread selected...");
        }
    }

    public void makeBurger(){

        System.out.println("Bread choice: " + this.breadType + "\n" +
                "Meat choice: " + this.meatType + "\n" + "vegetables and cream." + "\n" +
                "Total price = " + this.price + "$\n" +
                "Bon appetit!");

        System.out.println("------------------" + getClass().getSimpleName() +"-----------------------");

    }

}
