package fr.iutvalence.moturf.motus;


import java.util.Scanner;

/**
 * Main class
 * 
 * @author dottc, lionete
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
		Game game = new Game(Secret.getRandomSecret().toUpperCase(), playername);
		game.Start();
		scplayer.close();
	}
}
