package com.codecool.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class User {
    String username;
    LocalDate registrationDate;
    Set<Pony> listOfPonies;

    public User(String username, LocalDate registrationDate, Set<Pony> listOfPonies) {
        this.username = username;
        this.registrationDate = registrationDate;
        this.listOfPonies = listOfPonies;
    }

    public Set<Pony> getListOfPonies() {
        return listOfPonies;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void addPony(Pony pony) {
        listOfPonies.add(pony);
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
}

