package com.wiltrahan;

public class Dresser {

    private String color;
    private int numDraws;
    private Boolean hasMirror;

    public Dresser(String color, int numDraws, Boolean hasMirror) {
        this.color = color;
        this.numDraws = numDraws;
        this.hasMirror = hasMirror;
    }


    public String getColor() {
        return color;
    }

    public int getNumDraws() {
        return numDraws;
    }

    public Boolean getHasMirror() {
        return hasMirror;
    }
}
