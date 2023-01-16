package com.codecool.model;


import java.util.UUID;

public class Pony {
    public static final int MAXIMUM_AMOUNT_OF_MOVEMENT = 1;
    protected String name;
    protected int xp;
    protected Position position;
    protected UUID id;

    public void move(Position newPosition) {
        if (Math.abs(newPosition.getX() - position.getX()) <= MAXIMUM_AMOUNT_OF_MOVEMENT && Math.abs(newPosition.getY() - position.getY()) <= MAXIMUM_AMOUNT_OF_MOVEMENT) {
            position = newPosition;
        } else {
            throw new IllegalArgumentException("Cannot move more than 1 unit on x or y axis.");
        }
    }

    public void rename(String newName) {
        name = newName;
    }

    public void setPosition(Position position) {
        this.position = position;
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
