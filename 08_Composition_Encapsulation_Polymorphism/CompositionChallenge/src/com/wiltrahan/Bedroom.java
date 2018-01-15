package com.wiltrahan;

public class Bedroom {

    private Closet closet;
    private Bed bed;
    private Dresser dresser;

    public Bedroom(Closet closet, Bed bed, Dresser dresser) {
        this.closet = closet;
        this.bed = bed;
        this.dresser = dresser;
    }

    public void makeTheBed() {
        if(!bed.getMade()) {
            System.out.println("Bed is not made, hurry and make it before Jess comes home!");
        } else {
            System.out.println("Bed is made! Good work!");
        }
    }

    private Closet getCloset() {
        return closet;
    }


    private Bed getBed() {
        return bed;
    }

    public Dresser getDresser() {
        return dresser;
    }

}
