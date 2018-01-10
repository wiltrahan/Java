package com.wiltrahan;

public class Bedroom {
    private String name;
    private Closet closet;
    private Dresser dresser;
    private Bed bed;
    private TV tv;

    public Bedroom(String name, Closet closet, Dresser dresser, Bed bed, TV tv) {
        this.name = name;
        this.closet = closet;
        this.dresser = dresser;
        this.bed = bed;
        this.tv = tv;
    }

    public TV getTv() {
        return this.tv;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }

}
