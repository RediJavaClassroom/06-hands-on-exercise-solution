package com.redi.j2;

import com.redi.j2.utils.ConsoleColors;

public class Luigi extends Character implements FireballThrower{

    public Luigi() {
        super(ConsoleColors.GREEN_BRIGHT + "Luigi" + ConsoleColors.RESET);
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
