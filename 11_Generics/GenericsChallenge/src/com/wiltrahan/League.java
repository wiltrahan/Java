package com.wiltrahan;

public abstract class League {

    private String name;

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
