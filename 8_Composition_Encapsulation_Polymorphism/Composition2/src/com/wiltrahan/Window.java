package com.wiltrahan;

public class Window {

    private int height;
    private int width;
    private boolean open;

    public Window(int height, int width, boolean open) {
        this.height = height;
        this.width = width;
        this.open = open;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isOpen() {
        return open;
    }
}
