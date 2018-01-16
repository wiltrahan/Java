package com.wiltrahan;

public class DeluxeBurger extends Hamburger {

    private String chipType;
    private String drink;

    public DeluxeBurger(String name, String breadType, String chipType, String drink) {
        super(name, "Pounder", 8.00, breadType);
        this.chipType = chipType;
        this.drink = drink;
    }

    public void deluxeTotal() {
        System.out.println("You added " + this.chipType + " chips and " + this.drink + "\n" +
                        "Your Deluxe Burger total is $10.00");

    }


}
