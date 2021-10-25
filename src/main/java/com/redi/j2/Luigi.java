package com.redi.j2;

public class Luigi extends Character implements FireballThrower{

    public Luigi() {
        super("Luigi");
    }

    @Override
    public void jump() {
        System.out.println(this.getName() + " is jumping HIGH");
    }

    @Override
    public void throwFireball() {
        System.out.println(this.getName() + " is throwing a green fireball");
    }
}
