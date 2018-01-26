package com.wiltrahan;

public class Main {

    public static void main(String[] args) {
        NFL giants = new NFL("New York Giants");
        NFL eagles = new NFL("Philadelphia Eagles");
        NFL cowboys = new NFL("Dallas Cowboys");
        NFL redskins = new NFL("Washington Redskins");

        NFL patriots = new NFL("New England Patriots");
        NFL jets = new NFL("New York Jets");
        NFL bills = new NFL("Buffalo Bills");
        NFL dolphins = new NFL("Miami Dolphins");

//        NBA celtics = new NBA("Boston Celtics");
//        NBA spurs = new NBA("San Antonio Spurs");

        Team<NFL> NFC = new Team<>("NFC");
        Team<NFL> AFC = new Team<>("AFC");
        NFC.addTeam(giants);
        NFC.addTeam(eagles);
        NFC.addTeam(cowboys);
        NFC.addTeam(redskins);

        System.out.println("\n");

        AFC.addTeam(patriots);
        AFC.addTeam(jets);
        AFC.addTeam(bills);
        AFC.addTeam(dolphins);


//        Team<NBA> west = new Team<>("Western Conference");
//        Team<NBA> east = new Team<>("Eastern Conference");
//        west.addTeam(spurs);
//        east.addTeam(celtics);


    }
}
