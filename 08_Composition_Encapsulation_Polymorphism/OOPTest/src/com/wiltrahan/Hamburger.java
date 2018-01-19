package com.wiltrahan;

import java.text.DecimalFormat;

public class Hamburger {

    public String name;
    private String meat;
    public double baseCost;
    private String breadType;

    private String addOn1;
    private double addOn1Price;

    private String addOn2;
    private double addOn2Price;

    private String addOn3;
    private double addOn3Price;

    private String addOn4;
    private double addOn4Price;


    public Hamburger(String name, String meat, double baseCost, String breadType) {
        this.name = name;
        this.meat = meat;
        this.baseCost = baseCost;
        this.breadType = breadType;
    }

    public void hamburgerAddOn1(String name, double price) {
        this.addOn1 = name;
        this.addOn1Price = price;
    }

    public void hamburgerAddOn2(String name, double price) {
        this.addOn2 = name;
        this.addOn2Price = price;
    }

    public void hamburgerAddOn3(String name, double price) {
        this.addOn3 = name;
        this.addOn3Price = price;
    }

    public void hamburgerAddOn4(String name, double price) {
        this.addOn4 = name;
        this.addOn4Price = price;
    }

    public void burgerTotalCost() {
        DecimalFormat df1 = new DecimalFormat("$#.00");
        DecimalFormat df2 = new DecimalFormat("#.00");

        if(this.addOn1 != null) {
            System.out.println(this.addOn1 + " added for an additional " + df2.format(this.addOn1Price));
            baseCost += this.addOn1Price;
        }
        if(this.addOn2 != null) {
            System.out.println(this.addOn2 + " added for an additional " + df2.format(this.addOn2Price));
            baseCost += this.addOn2Price;
        }
        if(this.addOn3 != null) {
            System.out.println(this.addOn3 + " added for an additional " + df2.format(this.addOn3Price));
            baseCost += this.addOn3Price;
        }
        if(this.addOn4 != null) {
            System.out.println(this.addOn4 + " added for an additional " + df2.format(this.addOn4Price));
            baseCost += this.addOn4Price;
        }
        System.out.println(this.name.toUpperCase() + " total is: " + df1.format(this.baseCost));

    }
}
