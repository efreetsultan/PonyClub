package com.codecool.model;

import java.util.Random;

public interface Magic {

    String[] magicSymbols = {"@", "#", "&"};
    Random random = new Random();

    default void magic(Pony pony) {
        pony.rename(pony.getName() + magicSymbols[random.nextInt(magicSymbols.length)]);
        pony.setXp(pony.getXp() + 1);
        System.out.println("Haha! This is a funny message from " + pony.getName());
    }
}
