package com.wisekingdavid;

public class Main {
    public static void main(String[] args) {
        HamBurger burger = new HamBurger("Basic Burger", 6.5, "Simple roll", "Chicken");

        burger.addLettuce();
        burger.addTomatoes();
        burger.addCarrot();
        burger.meatChoice("chicken");
        burger.breadChoice("roll");
        burger.meatChoice("Beef");
        burger.makeBurger();


        HealthyBurger healthyBurger = new HealthyBurger(8 , "Plant base vegan");
        healthyBurger.addGarlicCream();
        healthyBurger.addCarrot();
        healthyBurger.meatChoice("green");
        healthyBurger.addGingerCream();
        healthyBurger.breadChoice("normal");
        healthyBurger.makeBurger();

        DeluxeBurger deluxeBurger = new DeluxeBurger(12,"Rolls", "Chicken");
        deluxeBurger.makeBurger();

    }
}
