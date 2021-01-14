package com.siit.generics.team;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Team<T extends Player> {
    // extends = upper bound --> T va putea fi Player, sau orice subclasa de-a ei
    // super = lower bound
    int score;

    List<T> players = new ArrayList<>();

    public boolean addPlayer(T player) {
        if (players.contains(player)) {
            System.out.println("Player is already selected for the team");
            return false;
        } else {
            players.add(player);
            System.out.println("Player" + player.getName() + " added to team");
            return true;
        }
    }

//    public static <W extends Player> void genericMethod(W obj) {
//        System.out.println(obj);
//    }

}
