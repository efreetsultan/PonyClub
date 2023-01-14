package com.codecool.model;


import java.util.UUID;

public class Pony {
    protected String name;
    protected int xp;
    protected Position position;
    protected UUID id;

    public void move(Position newPosition) {
        position = newPosition;
    }

    public void rename(String newName) {
        name = newName;
    }

    public Pony(String name, int xp, Position position) {
        this.name = name;
        this.xp = xp;
        this.position = position;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Position getPosition() {
        return position;
    }

}
