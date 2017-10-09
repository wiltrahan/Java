package com.wiltrahan;

public class TV {
    private String brand;
    private String size;
    private boolean smart;

    public TV(String brand, String size, boolean smart) {
        this.brand = brand;
        this.size = size;
        this.smart = smart;
    }

    public void turnOn() {
        System.out.println("TV -> Turning On");
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public boolean isSmart() {
        return smart;
    }
}
