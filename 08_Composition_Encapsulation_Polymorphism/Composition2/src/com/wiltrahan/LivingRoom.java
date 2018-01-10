package com.wiltrahan;

public class LivingRoom {
    private TV tv;
    private Couch couch;
    private Window window;

    public LivingRoom(TV tv, Couch couch, Window window) {
        this.tv = tv;
        this.couch = couch;
        this.window = window;
    }

    public void tvOn() {

        tv.turnOnTv();
        System.out.println("TV is still on");
    }

    public TV getTv() {
        return tv;
    }

    public Couch getCouch() {
        return couch;
    }

    public Window getWindow() {
        return window;
    }
}
