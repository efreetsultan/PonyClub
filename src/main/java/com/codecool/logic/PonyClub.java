package com.codecool.logic;

import com.codecool.model.Pony;
import com.codecool.model.SuperPony;
import com.codecool.model.User;
import com.codecool.model.Position;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class PonyClub {
    public static final int FREE_SUPERPONY_MONTH = 8;
    public static final String INITIAL_PONY_NAME = "InitialPonyName";
    public static final Position INITIAL_PONY_POSITION = new Position(1, 1);
    private Set<User> userList;
    private Set<Pony> ponyList;

   public Set<Pony> listOfPoniesByPosition(Position position) {
       return ponyList.stream().filter(p->p.getPosition().equals(position)).collect(Collectors.toUnmodifiableSet());
   }

   public User userWithHighestLevelPony() {
    return userList.stream().max(Comparator.comparingDouble(user -> user.getListOfPonies()
                    .stream()
                    .mapToDouble(Pony::getXp)
                    .max()
                    .orElse(0.0)))
            .orElse(null);
   }

   public void addUser(User user) {
       user.setRegistrationDate(LocalDate.now());
       if(user.getRegistrationDate().getMonthValue()== FREE_SUPERPONY_MONTH) {
           user.addPony(new SuperPony(INITIAL_PONY_NAME, 1, INITIAL_PONY_POSITION));
       }
       userList.add(user);
   }

    public PonyClub(Set<User> userList, Set<Pony> ponyList) {
        this.userList = userList;
        this.ponyList = ponyList;
    }
}
