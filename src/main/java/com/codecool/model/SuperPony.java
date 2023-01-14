package com.codecool.model;


public class SuperPony extends Pony implements Magic, Fly{
    public SuperPony(String name, int xp, Position position) {
        super(name, xp, position);
    }
}
