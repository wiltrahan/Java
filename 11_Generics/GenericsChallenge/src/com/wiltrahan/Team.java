package com.wiltrahan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Team<T extends League> {

    private String name;

    private ArrayList<T> teams = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if(teams.contains(team)) {
            System.out.println("The " + team.getName() + " have already been added");
            return false;
        } else {
            teams.add(team);
            System.out.println("The " + team.getName() + " have been successfully added to the " + this.name);
            return true;
        }
    }

    public int numTeams() {
        return this.teams.size();
    }


}
