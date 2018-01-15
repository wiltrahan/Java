package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
        Closet myCloset = new Closet("8 feet", 12,true);
        Bed myBed = new Bed("Queen",4,true);
        Dresser myDresser = new Dresser("Brown", 10,false);

        Bedroom myBedroom = new Bedroom(myCloset, myBed, myDresser);

        myBedroom.makeTheBed();

        System.out.println("The dresser has: " + myBedroom.getDresser().getNumDraws() + " draws");

        

    }
}
