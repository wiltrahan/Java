package com.wiltrahan;

public class Closet {

    private String size;
    private int numShelves;
    private boolean isHers;

    public Closet(String size, int numShelves, boolean isHers) {
        this.size = size;
        this.numShelves = numShelves;
        this.isHers = isHers;
    }

    public String getSize() {
        return size;
    }

    public int getNumShelves() {
        return numShelves;
    }

    public boolean isHers() {
        return isHers;
    }
}
