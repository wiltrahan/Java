package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("234B", "Dell","240", dimensions);
        Monitor theMonitor = new Monitor("27inch Flat", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-2010", "Crucial", 8, 4,"v2.44");
        PC thePc = new PC(theCase, theMonitor, theMotherboard);
        thePc.powerUp();

        Window window = new Window(48, 24,false);
        Couch myCouch = new Couch("sectional", 8,"leather");
        TV myTv = new TV("XD787", "Curved", 65);

        LivingRoom myLivingRoom = new LivingRoom(myTv, myCouch, window);
        myLivingRoom.tvOn();

    }
}
