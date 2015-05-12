package fr.iutvalence.moturf.motus;

import java.util.Scanner;

/* TODO JAVADOC. */
public class Main {

    /* TODO JAVADOC. */
    public static void main(String[] args) {
        // TODO Scanner for secret.
        Scanner scplayer = new Scanner(System.in);
        System.out.println("What's your name ?");
        String playername = scplayer.nextLine();
        Game game = new Game("ABCCEFGH", playername);
        game.start();
        scplayer.close();
    }
}
