package com.morrisje;


public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer jim = new BaseballPlayer("Jim");
        BasketballPlayer tim = new BasketballPlayer("Tim");


        Team clemsonTigers = new Team("Clemson Tigers");
        clemsonTigers.addPlayer(joe);
        clemsonTigers.addPlayer(jim);
        clemsonTigers.addPlayer(tim);

        System.out.println(clemsonTigers.numPlayers());
    }
}
