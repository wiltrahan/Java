package com.wiltrahan;

import java.util.*;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer, learning JAVA"));
        locations.put(1, new Location(1, "You are standing at the end of a road, before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside of a building"));
        locations.put(4, new Location(4, "You are in a valley"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String[] direction = scanner.nextLine().toUpperCase().split(" ");

            List<String> directionList = Arrays.asList(direction);

            if(directionList.contains("EAST") || directionList.contains("E")) {
                loc = exits.get("E");
            } else if(directionList.contains("WEST") || directionList.contains("W")) {
                loc = exits.get("W");
            } else if(directionList.contains("NORTH") || directionList.contains("N")) {
                loc = exits.get("N");
            } else if(directionList.contains("SOUTH") || directionList.contains("S")) {
                loc = exits.get("S");
            } else if(directionList.contains("QUIT") || directionList.contains("Q")) {
                loc = exits.get("Q");
            } else {
                System.out.println("You cannot go in that direction");
            }

        }
    }
}
