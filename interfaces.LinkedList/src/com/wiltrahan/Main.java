package com.wiltrahan;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Illmatic", "Nas");
        album.addSong("The Genesis", 1.45);
        album.addSong("N.Y. State of Mind", 4.54);
        album.addSong("Life's a Bitch", 3.30);
        album.addSong("The World is Yours", 4.51);
        album.addSong("Halftime", 4.21);
        album.addSong("Memory Lane", 4.08);
        album.addSong("One Love", 5.25);
        album.addSong("One Time 4 Your Mind", 3.19);
        album.addSong("Represent", 4.13);
        album.addSong("Ain't Hard to Tell", 3.22);
        albums.add(album);

        album = new Album("Midnight Marauders", "A Tribe Called Quest");
        album.addSong("Midnight Marauders Tour (intro)", 0.45);
        album.addSong("Steve Biko (Stir it Up)", 3.12);
        album.addSong("Award Tour", 3.46);
        album.addSong("8 Million Stories", 4.22);
        album.addSong("Sucka", 4.06);
        album.addSong("Midnight", 4.24);
        album.addSong("We Can Get Down", 4.19);
        album.addSong("Electric Relaxation", 4.04);
        album.addSong("Clap Your Hands", 3.16);
        album.addSong("Oh My God", 3.30);
        album.addSong("Keep It Rollin'", 3.06);
        album.addSong("The Chase, Part II", 4.02);
        album.addSong("Lyrics to Go", 4.10);
        album.addSong("God Lives Through", 4.14);
        albums.add(album);

        List<Song> playList = new ArrayList<Song>();
        albums.get(0).addToPlayList("Halftime", playList);
        albums.get(0).addToPlayList("One Love", playList);
        albums.get(0).addToPlayList("Represent", playList);
        albums.get(0).addToPlayList("Hate Me Now", playList); //doesn't exist
        albums.get(0).addToPlayList(10, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(5, playList);
        albums.get(1).addToPlayList(18, playList); //doesn't exist

        play(playList);
    }

    private static void play(List<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist Complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playList\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playList");
    }

    private static void printList(List<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=====================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("======================");
    }
}
