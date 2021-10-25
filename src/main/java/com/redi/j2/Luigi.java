package com.redi.j2;

public class Luigi extends Character {

    public Luigi() {
        super("Luigi");
    }

    @Override
    public void jump() {
        System.out.println(this.getName() + " is jumping HIGH");
    }
}
