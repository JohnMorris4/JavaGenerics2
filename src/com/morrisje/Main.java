package com.morrisje;


import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer jim = new BaseballPlayer("Jim");
        BaseballPlayer kevin = new BaseballPlayer("Kevin");
        BasketballPlayer tim = new BasketballPlayer("Tim");


        Team<FootballPlayer> clemsonTigers = new Team<>("Clemson Tigers Football");
        clemsonTigers.addPlayer(joe);
//        clemsonTigers.addPlayer(jim);
//        clemsonTigers.addPlayer(tim);

        System.out.println(clemsonTigers.numPlayers());

        Team<BaseballPlayer> clemsonBaseball = new Team<>("Clemson Tigers Baseball");
        clemsonBaseball.addPlayer(jim);
        clemsonBaseball.addPlayer(kevin);

        Team<BasketballPlayer> hurricains = new Team<>("Chicago Hurricaines");
        hurricains.addPlayer(tim);



        //FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        //SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        //Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        //brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//        adelaideCrows.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getTeamName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getTeamName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getTeamName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getTeamName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

        //ArrayList<Team> teams;
        //Collections.sort(teams);
    }
}
