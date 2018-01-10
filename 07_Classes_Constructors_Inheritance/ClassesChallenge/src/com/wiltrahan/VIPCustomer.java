package com.wiltrahan;

public class VIPCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIPCustomer() {
        this("Default Name", 0.00,"default@us.gov");
        System.out.println("Empty constructor called.");
    }

    public VIPCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VIPCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@us.gov");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
