package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();



        Closet mycloset = new Closet("6feet");
        Dresser myDresser = new Dresser(8,"black");
        TV myTV = new TV("Samsung","55inch",true);
        Bed myBed = new Bed("king",4,36,3,1);

        Bedroom myBedroom = new Bedroom("Wil's room", mycloset, myDresser, myBed, myTV);

        myBedroom.makeBed();
        myBedroom.getTv().turnOn();

    }
}
