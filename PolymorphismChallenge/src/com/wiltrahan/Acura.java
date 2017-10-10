package com.wiltrahan;

class Acura extends Car {
    public Acura(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Acura -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Acura -> accelerate()";
    }

    @Override
    public String brake() {
        return "Acura -> brake()";
    }
}

