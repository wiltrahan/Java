package com.wiltrahan;

public class Larry extends Bird {

    public Larry(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Larry CAN Fly!");
    }
}
