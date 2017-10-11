package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
	    double price = hamburger.itemizeHamburger();
	    hamburger.addHamburgerAddition1("Tomato", 0.50);
	    hamburger.addHamburgerAddition2("Lettuce", 0.25);
	    hamburger.addHamburgerAddition3("Cheese", 1.25);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());
    }
}
