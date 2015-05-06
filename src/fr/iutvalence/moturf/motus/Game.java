package fr.iutvalence.moturf.motus;

import java.util.Scanner;

/**
 * TODO JAVADOC Game Class
 *
 * 
 * @author dottc, lionete
 * @version 1.0
 */
public class Game {

	/** Player. */
	public final Player player;
	/** Grid. */
	public final Grid grid;
	/** Secret word. */
	private final Secret secret;

	/* TODO JAVADOC */
	public Game(final String secret, final String player) {
		this.secret = new Secret(secret);
		this.player = new Player(player);
		grid = new Grid();
	}

	/* TODO JAVADOC */
	public void start() {
		Scanner scattempt = new Scanner(System.in);
		int turn = 0;
		boolean victory = true;
		while (turn < Grid.NB_LINES) {
			System.out.println(grid.toString(turn));
			System.out.println("Please, choose a word of 8 letters");
			String attempt = scattempt.nextLine();
			Tiles[] answer = secret.check(attempt);
			// TODO Vérifier que attempt soit bien une chaîne de 8 caractères
			// grid.setLine(answer, turn);
			for (Tiles tile : answer) {
				if (tile.getColor() != Color.GREEN) {
					victory = false;
				}
			}

			if (victory) {
				System.out.println("You won in " + turn + " turns !");
				break;
			}
			turn++;
		}
	}
}
