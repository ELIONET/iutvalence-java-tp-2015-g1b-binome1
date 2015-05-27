package fr.iutvalence.moturf.motus;

import java.util.Scanner;

import javax.swing.SwingUtilities;

import fr.iutvalence.moturf.motus.view.Window;


/**
 * Game Class
 *
 * @author dottc, lionete
 * @version 2.0
 */
public class Game {
	/** Player. */
	private final Player player;
	/** Grid. */
	public final Grid grid;
	/** Secret word. */
	private final Secret secret;
	/** Scanner. */
	private Scanner scattempt;

    /**
     * Create a new game using a Secret and a player
     */
	    public Game(String secret, String player, Scanner sc) {
	        this.secret = new Secret(secret);
	        this.player = new Player(player);
	        this.scattempt = sc;
	        grid = new Grid();
	    }

	/**
	 * Start the game.
	 */
    public boolean start() {
		
		int turn = 0;
		boolean victory = false;
		while ((turn < Grid.NB_LINES) && (!victory)) {
			victory = true;
			System.out.println("Please, choose a word of 8 letters");
			String attempt = scattempt.nextLine().toUpperCase().trim();

			while (attempt.length() != Grid.NB_COLUMNS) {
				System.err.println("Your attempt length isn't equal to 8, please chose a new word.");
				attempt = scattempt.nextLine().toUpperCase().trim();
			}
			Tiles[] answer = secret.check(attempt);
			grid.setLine(turn, answer);
			System.out.println(grid.toString(turn));
			for (Tiles tile : answer) {
				if (tile.getColor() != GuessColor.GREEN) {
					victory = false;
				}
			}

			if (victory) {
				System.out.println("Congratulation! " + player.getName() + " won in " + (turn + 1) + " turns !");
			}

			turn++;

		}
		if (turn == Grid.NB_LINES && !victory) {
			System.out.println("Sorry" + player.getName() +", you lost !");
		}
		System.out.println("Do you want to play again ? (yes/no)");
		return scattempt.nextLine().toLowerCase().trim().equals("yes");
	}
}
