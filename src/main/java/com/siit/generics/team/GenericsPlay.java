package com.siit.generics.team;

import lombok.Data;

@Data
public class GenericsPlay {

    public static void main(String... args) {

        Team<FootballPlayer> footballTeam = new Team<>();

        footballTeam.addPlayer(new FootballPlayer("Beckham"));
        footballTeam.addPlayer(new FootballPlayer("Messi"));
//        footballTeam.addPlayer(new BasketPlayer("Jordan"));



        Team<BasketPlayer> bascketTeam = new Team<>();

        bascketTeam.addPlayer(new BasketPlayer("Jordan"));
        bascketTeam.addPlayer(new BasketPlayer("Lebrom james"));
        bascketTeam.addPlayer(new BasketPlayer("O'neil"));



        Team<Player> team = new Team<>();
        BasketPlayer jordan = new BasketPlayer("Jordan");
        team.addPlayer(jordan);
        team.addPlayer(new FootballPlayer("Beckham"));

        System.out.println(team.getPlayers());

//        Team<String> team = new Team<String>();// nu compileaza pt ca am adaugat upper bound = T extends SuperClass/Interface

    }
}
