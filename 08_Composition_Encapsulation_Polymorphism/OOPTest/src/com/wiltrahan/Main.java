package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Rhode Islander", "Kobe Beef", 5.00, "Pretzel Roll");
        hamburger.hamburgerAddOn1("Swiss Cheese", 0.50);
        hamburger.hamburgerAddOn2("Onions",0.50);
        hamburger.hamburgerAddOn3("Mushrooms",0.50);
        hamburger.hamburgerAddOn4("Lettuce", 0.50);

        hamburger.burgerTotalCost();

        System.out.println("************");

        HealthyBurger healthyBurger = new HealthyBurger("The Jess");
        healthyBurger.addHealthy1("Sweet Potatoes", 1.00);
        healthyBurger.addHealthy2("Kale", 1.00);

        healthyBurger.healthyTotal();

        System.out.println("**************");
        DeluxeBurger deluxeBurger = new DeluxeBurger("The Monster", "White", "BBQ", "Water");
        deluxeBurger.deluxeTotal();
    }
}
