package com.wiltrahan;

class Tesla extends Car {
    public Tesla(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Tesla -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Tesla -> accelerate()";
    }

    @Override
    public String brake() {
        return "Tesla -> brake()";
    }
}
