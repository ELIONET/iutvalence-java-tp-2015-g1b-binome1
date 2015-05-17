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
	private Boolean Play(Scanner scattempt) {
		
		int turn = 0;
		boolean victory = false;
		boolean keepPlaying = false;
		while ((turn < Grid.NB_LINES) && (!victory)) {
			victory = true;
			System.out.println("Please, choose a word of 8");
			String attempt = scattempt.nextLine().toUpperCase();
			while (attempt.length() != Grid.NB_COLUMNS) {
				System.out.println("Your attempt length isn't equal to 8, please chose a new word.");
				attempt = scattempt.nextLine().toUpperCase();
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
			System.out.println("Sorry" + player.getName() +", you lost !");
		}
		System.out.println("Do you want to play again ? (yes/no)");
		String answer = scattempt.nextLine();
		if(answer=="yes")
			keepPlaying=true;
		return keepPlaying;
	}

    public void Start() {
    	Scanner mainScanner = new Scanner(System.in);
    	do{
    	} while(Play(mainScanner));
    	mainScanner.close();
    }
}