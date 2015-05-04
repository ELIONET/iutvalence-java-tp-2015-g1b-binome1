package fr.iutvalence.moturf.motus;
import java.util.Scanner;

/**
 * TODO JAVADOC Game Class
 *

 * @author dottc, lionete
 * @version 1.0
 */
public class Game {
    
	/** Player. */
    public final Player player;
    /** Grid. */
    public final Grid   grid;
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
    	int turn = 0;
    	boolean victory = true;
    	while (turn < Grid.NB_LINES) {
    		System.out.println(grid.toString(turn));
    		// TODO Nouvelle ligne à saisir
    		String guess = "TENTATIVE";
    		// TODO En retour de check vous aurez ce qu'il faut mettre dans la grid
    		Tiles[] answer = secret.check(guess);
    		//grid.setLine(answer, turn);
    		for(int k=0; k < answer.length; k++){
    			if(answer[k].getColor()!=Color.GREEN){
    				victory = false;
    			}
    		}
    		if(victory)
    			System.out.println("You won in "+turn+" turns !");
    		//if (secret.check(s) = secret)                      
    		turn = turn+1;
    		// TODO mettre à jour turn et vérifier la victoire
    	}
    }
}
