package com.redi.j2;

import com.redi.j2.utils.ConsoleColors;

public class Toad extends Character {

    public Toad() {
        super(ConsoleColors.YELLOW_BRIGHT + "Toad" + ConsoleColors.RESET);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is running FAST");
    }
}
