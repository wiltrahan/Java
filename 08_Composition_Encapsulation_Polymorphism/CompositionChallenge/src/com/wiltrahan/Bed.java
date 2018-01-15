package com.wiltrahan;

public class Bed {

    private String size;
    private int numPillows;
    private Boolean isMade;

    public Bed(String size, int numPillows, Boolean isMade) {
        this.size = size;
        this.numPillows = numPillows;
        this.isMade = isMade;
    }



    public String getSize() {
        return size;
    }

    public int getNumPillows() {
        return numPillows;
    }

    public Boolean getMade() {
        return isMade;
    }
}
