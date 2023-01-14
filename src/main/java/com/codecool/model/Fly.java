package com.codecool.model;


public interface Fly {
    default void fly(Pony pony,Position newPosition){
        pony.move(newPosition);
        System.out.println("Haha! This is a funny message from "+pony.getName());
    };
}
