package com.wiltrahan;

public class TV {

    private String model;
    private String type;
    private int size;

    public TV(String model, String type, int size) {
        this.model = model;
        this.type = type;
        this.size = size;
    }

    public void turnOnTv() {
        System.out.println("TV has been turned on.");
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }
}
