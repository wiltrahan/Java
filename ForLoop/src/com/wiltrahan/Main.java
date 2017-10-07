package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% = " + calculateInterest(10000.00, 2.0));

        for(int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
