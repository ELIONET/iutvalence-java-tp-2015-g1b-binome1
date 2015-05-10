package fr.iutvalence.moturf.motus;

import java.util.Scanner;

/**
 * TODO JAVADOC Game Class
 *
 * @author dottc, lionete
 * @version 1.0
 */
public class Game {
    /* TODO public ? */
    /** Player. */
    private static Player player;
    /* TODO public ? */
    /** Grid. */
    public final  Grid   grid;
    /** Secret word. */
    private final Secret secret;

    /* TODO JAVADOC */
    public Game(String secret, String player) {
        this.secret = new Secret(secret);
        this.player = new Player(player);
        grid = new Grid();
    }

    /* TODO JAVADOC */
    public void start() {
        Scanner scattempt = new Scanner(System.in);

        int turn = 0;
        boolean victory=false;
        while ((turn < Grid.NB_LINES) && (!victory)) {
        	victory=true;
            // TODO Why '8' ?
            System.out.println("Please, choose a word of 8 letters");
            String attempt = scattempt.nextLine();
            while(attempt.length() != 8){
            	System.out.println("Your attempt length isn't equal to 8, please chose a new word.");
            	attempt = scattempt.nextLine();
            }
            Tiles[] answer = secret.check(attempt);
            // TODO grid.setLine(answer, turn);
            for (Tiles tile : answer) {
            	System.out.println(tile.getColor());
                if (tile.getColor() != Color.GREEN) {
                    victory = false;
                }
            }
            
            System.out.println(grid.toString(turn));

            if (victory) {
                System.out.println("Congratulation! You won in " + (turn+1) + " turns !");
            }
            
            turn++;
        }
        if(turn == Grid.NB_LINES){
        	System.out.println("Sorry, you lost !");
        }
        scattempt.close();
    }
}
