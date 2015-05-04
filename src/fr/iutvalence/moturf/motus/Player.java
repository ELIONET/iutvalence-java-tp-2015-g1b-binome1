package fr.iutvalence.moturf.motus;

/**
 * TODO JAVADOC. Player Class
 *
 * @author dottc, lionete
 * @version 2.0.0
 */
public class Player {
    /** Default score. */
    private static final int DEFAULT_SCORE = 0;
    /** Player's name. */
    private final String name;
    /** Score. */
    private       int    score;

    /** Set player's name and default score. */
    public Player(String n) {
        name = n;
        score = DEFAULT_SCORE;
    }

    /** Get player's name. */
    public String getName() {
        return name;
    }

    /* TODO The name and the behavior of this method are pretty strange… */
    /** Set player's score. */
    public void setScore() {
        this.score = this.score + 1;
    }

    /** Get player's score. */
    public int getScore() {
        return score;
    }
}
