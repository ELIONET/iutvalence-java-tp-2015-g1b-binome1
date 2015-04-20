package fr.iutvalence.moturf.motus;

/**
 * TODO JAVADOC
 *

 * @author dottc, lionete
 * @version 1.0
 */
public class Game {
    /* TODO final ? */
    /* TODO JAVADOC. */
    public  Player player;
    /* TODO final ? */
    public  Grid   grid;
    /* TODO final ? */
    private Secret secret;

    /* TODO JAVADOC */
    public Game(final String secret, final String player) {
        this.secret = new Secret(secret);
        this.player = new Player(player);
        grid = new Grid();
    }

    /* TODO JAVADOC */
    public void start() {
    }
}
