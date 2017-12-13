package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("234B", "Dell","240", dimensions);

        Monitor theMonitor = new Monitor("27inch Flat", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-2010", "Crucial", 8, 4,"v2.44");

        PC thePc = new PC(theCase, theMonitor, theMotherboard);
        thePc.getMonitor().drawPixelAt(1500, 1200, "Red");
        thePc.getMotherboard().loadProgram("Windows95");
        thePc.getTheCase().pressPowerButton();

    }
}
