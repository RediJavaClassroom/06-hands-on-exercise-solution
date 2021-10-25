package com.redi.j2;

public class Mario extends Character implements FireballThrower, GiantStomper {

    public Mario() {
        super("Mario");
    }

    @Override
    public void throwFireball() {
        System.out.println(this.getName() + " is throwing a red fireball");
    }

    @Override
    public void stomp() {
        System.out.println(this.getName() + " STOMPS!");
    }
}
