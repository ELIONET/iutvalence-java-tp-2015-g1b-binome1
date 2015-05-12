package fr.iutvalence.moturf.motus;

import java.util.Scanner;

/**
 * Game Class
 *
 * @author dottc, lionete
 * @version 1.0
 */
public class Game {
	/* TODO public ? */
	/** Player. */
	private final Player player;
	/* TODO public ? */
	/** Grid. */
	public final Grid grid;
	/** Secret word. */
	private final Secret secret;

    /* TODO JAVADOC */
	    public Game(String secret, String player) {
	        this.secret = new Secret(secret);
	        this.player = new Player(player);
	        grid = new Grid();
	    }

    /**
     * Start the game
     */
    public void start() {
        Scanner scattempt = new Scanner(System.in);
		int turn = 0;
		boolean victory = false;
		while ((turn < Grid.NB_LINES) && (!victory)) {
			victory = true;
			// TODO Why '8' ?
			System.out.println("Please, choose a word of 8 capital letters");
			String attempt = scattempt.nextLine();
			while (attempt.length() != Grid.NB_COLUMNS) {
				System.out.println("Your attempt length isn't equal to 8, please chose a new word.");
				attempt = scattempt.nextLine();
			}
			Tiles[] answer = secret.check(attempt);
			grid.setLine(turn, answer);
			System.out.println(grid.toString(turn));
			for (Tiles tile : answer) {
				if (tile.getColor() != Color.GREEN) {
					victory = false;
				}
			}

			if (victory) {
				System.out.println("Congratulation! " + player.getName() + " won in " + (turn + 1) + " turns !");
			}

			turn++;

		}
		if (turn == Grid.NB_LINES) {
			System.out.println("Sorry, you lost !");
		}
		scattempt.close();
	}
}
