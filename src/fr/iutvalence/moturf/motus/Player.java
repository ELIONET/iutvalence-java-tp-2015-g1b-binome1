package fr.iutvalence.moturf.motus;

/**
 * TODO JAVADOC.
 *
 * @author dottc, lionete
 * @version 2.0.0
 */
public class Player {
    /* TODO Private ? */
    /** Default score. */
    public static final int DEFAULT_SCORE = 0;
    /* TODO Private ? */
    /** Player's name. */
    public final String name;
    /* TODO Private ? */
    /** Score. */
    public       int    score;

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
