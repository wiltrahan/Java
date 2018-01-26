package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
        NFL giants = new NFL("New York Giants");
        NFL patriots = new NFL("New England Patriots");

        NBA celtics = new NBA("Boston Celtics");
        NBA spurs = new NBA("San Antonio Spurs");

        Team<NFL> NFC = new Team<>("NFC");
        Team<NFL> AFC = new Team<>("AFC");
        NFC.addTeam(giants);
        AFC.addTeam(patriots);

        System.out.println("\n");

        Team<NBA> west = new Team<>("Western Conference");
        Team<NBA> east = new Team<>("Eastern Conference");
        west.addTeam(spurs);
        east.addTeam(celtics);

        AFC.addTeam(patriots);
    }
}
