package com.wiltrahan;

public class DeluxeBurger extends Hamburger {

    private String chipType;
    private String drink;

    public DeluxeBurger(String name, String breadType, String chipType, String drink) {
        super(name, "1/2 pound", 8.00, breadType);
        this.chipType = chipType;
        this.drink = drink;
    }

    public void deluxeTotal() {
        System.out.println(this.chipType + " chips and " + this.drink + " added \n" +
                        this.name.toUpperCase() + " total is $10.00");

    }
}
