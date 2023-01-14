package com.codecool.logic;

import com.codecool.model.*;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PonyClubTest {
    Pony pony1 = new Pony("Lyra", 1, new Position(0,0));
    Pegasus pegasus1 = new Pegasus("Rainbow Dash", 1, new Position(0,0));
    Unicorn unicorn1 = new Unicorn("Shinning Armor",1,new Position(0,0));
    SuperPony superPony1 = new SuperPony("Twilight Sparkle",1,new Position(0,0));
    Set<Pony> ponyList = Set.of(pony1,pegasus1,unicorn1,superPony1);
    User user1 = new User("Joe", LocalDate.now(), Set.of(pony1, pegasus1));
    User user2 = new User("Mary", LocalDate.now(),Set.of(unicorn1, superPony1));

    Set<User> userSet = Set.of(user1,user2);
    PonyClub ponyClub = new PonyClub(userSet, ponyList);

    @Test
            void getSamePosition() {
        assertEquals(ponyList, ponyClub.listOfPoniesByPosition(new Position(0,0)));
    }

    @Test
    void getUserWithHighestLevelPony() {
        unicorn1.magic(unicorn1);
        assertEquals(user2, ponyClub.userWithHighestLevelPony());

    }


}