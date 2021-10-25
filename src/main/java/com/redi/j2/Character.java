package com.redi.j2;

public class Character {

    private String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(this.getName() + " is running (default)");
    }

    public void jump() {
        System.out.println(this.getName() + " is jumping (default)");
    }
}
