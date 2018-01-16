package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        //int pagesPrinted = printer.printPages(4);
        //System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(30);

        System.out.println("Pages printed was " + pagesPrinted +
                "\nTotal cost: " + printer.getTotalCost());

    }
}
