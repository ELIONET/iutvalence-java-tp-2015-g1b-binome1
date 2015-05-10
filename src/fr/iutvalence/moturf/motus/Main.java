package fr.iutvalence.moturf.motus;

import java.util.Scanner;

/* TODO JAVADOC. */
public class Main {

    /* TODO JAVADOC. */
    public static void main(String[] args) {
        // TODO Scanner for secret and player name.
        Scanner scplayer = new Scanner(System.in);
        System.out.println("What's your name ?");
        String player = scplayer.nextLine();
        Game game = new Game("ABKKEFGH", player);
        game.start();
        scplayer.close();
    }
}
