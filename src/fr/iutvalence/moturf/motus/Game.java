package fr.iutvalence.moturf.motus;

/**
 *
 * 
 * @author dottc, lionete
 *
 * v1.0
 * 
 */

/* TODO : JAVADOC */

public class Game {

	
	private Secret secret;
	public Player player;
	public Grid grid;
	
	public Game(final String secret, final String player) {
		this.secret = new Secret(secret);
		this.player = new Player(player);
		grid = new Grid();
	}

	public void start() {
		
	}
}
