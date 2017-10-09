package com.wiltrahan;

public class Dresser {
    private int numDraws;
    private String color;

    public Dresser(int numDraws, String color) {
        this.numDraws = numDraws;
        this.color = color;
    }

    public int getNumDraws() {
        return numDraws;
    }

    public String getColor() {
        return color;
    }
}
