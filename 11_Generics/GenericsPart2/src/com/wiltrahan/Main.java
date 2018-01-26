package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
        FootballPlayer odell = new FootballPlayer("Odell Beckham");
        FootballPlayer eli = new FootballPlayer("Eli Manning");
        FootballPlayer landon = new FootballPlayer("Landon Collins");

        BaseballPlayer manny = new BaseballPlayer("Manny Ramirez");
        BaseballPlayer pedro = new BaseballPlayer("Pedro Martinez");
        BaseballPlayer dave = new BaseballPlayer("Dave Roberts");

        BasketballPlayer kyrie = new BasketballPlayer("Kyrie Irving");
        BasketballPlayer al = new BasketballPlayer("Al Horford");
        BasketballPlayer marcus = new BasketballPlayer("Marcus Smart");


        Team<FootballPlayer> newYorkGiants = new Team<>("New York Giants");
        newYorkGiants.addPlayer(odell);
        newYorkGiants.addPlayer(eli);
        newYorkGiants.addPlayer(landon);

        Team<BaseballPlayer> bostonRedSox = new Team<>("Boston Red Sox");
        bostonRedSox.addPlayer(manny);
        bostonRedSox.addPlayer(pedro);
        bostonRedSox.addPlayer(dave);

        Team<BasketballPlayer> bostonCeltics = new Team<>("Boston Celtics");
        bostonCeltics.addPlayer(kyrie);
        bostonCeltics.addPlayer(al);
        bostonCeltics.addPlayer(marcus);

        System.out.println("\n");

        Team<FootballPlayer> newEnglandPatriots = new Team<>("New England Patriots");
        newEnglandPatriots.matchResult(newYorkGiants,14,27);

        Team<BasketballPlayer> newYorkKnicks = new Team<>("New York Knicks");
        bostonCeltics.matchResult(newYorkKnicks, 112,97);

        System.out.println("\n");

        System.out.println("Rankings");
        System.out.println(bostonCeltics.getName() + ": " + bostonCeltics.ranking());
        System.out.println(newYorkGiants.getName() + ": " + newYorkGiants.ranking());

        System.out.println(bostonCeltics.compareTo(newYorkKnicks));
        System.out.println(newYorkKnicks.compareTo(bostonCeltics));

    }
}
