package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n");

        Hamburger hamburger = new Hamburger("Little Guy", "beef", 5.00, "white");
        hamburger.hamburgerAddOn1("Swiss Cheese", 0.50);
        hamburger.hamburgerAddOn2("Onions",0.50);
        hamburger.hamburgerAddOn3("Mushrooms",0.50);
        hamburger.hamburgerAddOn4("Mayo", 0.50);

        hamburger.burgerTotalCost();

        System.out.println("\n");

        HealthyBurger healthyBurger = new HealthyBurger("The Jess");
        healthyBurger.addHealthy1("Sweet Potatoes", 1.00);
        healthyBurger.addHealthy2("Kale", 1.00);

        healthyBurger.healthyTotal();

        System.out.println("\n");

        DeluxeBurger deluxeBurger = new DeluxeBurger("The Monster", "White", "BBQ", "Water");
        deluxeBurger.deluxeTotal();

        //System.out.println("\n");

    }
}
