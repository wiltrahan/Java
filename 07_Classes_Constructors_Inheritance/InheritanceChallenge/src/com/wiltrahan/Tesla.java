package com.wiltrahan;

public class Tesla extends Car {

    private String model;
    private boolean taxCredit;

    public Tesla(String color, int currentSpeed, int doors, int gears, String model, boolean taxCredit) {
        super("Tesla", color, 4, currentSpeed, doors, false, gears, true);
        this.model = model;
        this.taxCredit = taxCredit;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentSpeed() + rate;
        if(newVelocity == 0) {
            stop();
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if(newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else if(newVelocity > 30 && newVelocity <= 40) {
            changeGear(4);
        } else if(newVelocity > 40 && newVelocity  <= 50) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if(newVelocity > 0) {
            changeSpeed(newVelocity);
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTaxCredit(boolean taxCredit) {
        this.taxCredit = taxCredit;
    }


}
