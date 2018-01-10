package com.wiltrahan;

public class Couch {
    private String type;
    private int seats;
    private String material;

    public Couch(String type, int seats, String material) {
        this.type = type;
        this.seats = seats;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public String getMaterial() {
        return material;
    }
}
