package fr.iutvalence.moturf.motus;

import java.util.Scanner;

/**
 * Main class
 * @author Clément
 *
 */
public class Main {

    /**
     * Start the game
     */
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
