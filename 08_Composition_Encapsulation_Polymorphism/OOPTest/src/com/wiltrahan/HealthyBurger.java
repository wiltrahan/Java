package com.wiltrahan;

import java.text.DecimalFormat;

public class HealthyBurger extends Hamburger {

    public HealthyBurger(String name) {
        super(name, "Black Bean", 6.00, "Brown Rye");
    }

    private String healthyItemOne;
    public double healthyItemOneCost;

    private String healthyItemTwo;
    public double healthyItemTwoCost;

    public void addHealthy1(String name, double price) {
        this.healthyItemOne = name;
        this.healthyItemOneCost = price;
    }

    public void addHealthy2(String name, double price) {
        this.healthyItemTwo = name;
        this.healthyItemTwoCost = price;
    }

    public void healthyTotal() {

        DecimalFormat df1 = new DecimalFormat("$#.00");

        if(this.healthyItemOne != null) {
            System.out.println(this.healthyItemOne + " added for an additional " + df1.format(this.healthyItemOneCost));
            baseCost += this.healthyItemOneCost;
        }
        if(this.healthyItemTwo != null) {
            System.out.println(this.healthyItemTwo + " added for an additional " + df1.format(this.healthyItemTwoCost));
            baseCost += this.healthyItemOneCost;
        }

        System.out.println(this.name.toUpperCase() + " total is: " + df1.format(this.baseCost));
    }
}