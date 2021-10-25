package com.redi.j2;

public class Toad extends Character {

    public Toad() {
        super("Toad");
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running FAST");
    }
}
