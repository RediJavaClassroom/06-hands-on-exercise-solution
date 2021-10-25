package com.redi.j2;

import com.redi.j2.utils.ConsoleColors;

public class Mario extends Character implements FireballThrower, GiantStomper {

    public Mario() {
        super(ConsoleColors.RED_BRIGHT + "Mario" + ConsoleColors.RESET);
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
