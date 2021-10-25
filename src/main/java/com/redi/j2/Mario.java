package com.redi.j2;

public class Mario extends Character implements FireballThrower{

    public Mario() {
        super("Mario");
    }

    @Override
    public void throwFireball() {
        System.out.println(this.getName() + " is throwing a red fireball");
    }
}
