package com.redi.j2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Character> characters = new ArrayList<>();

        characters.add(new Mario());
        characters.add(new Luigi());
        characters.add(new Toad());

        for(Character c : characters) {
            c.run();
            c.jump();
            if(c instanceof FireballThrower) {
                ((FireballThrower) c).throwFireball();
            }
            if(c instanceof GiantStomper) {
                ((GiantStomper) c).stomp();
            }
        }
    }
}
