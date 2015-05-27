package fr.iutvalence.moturf.motus;

/**
 * Tiles class
 * This class contains everything to make tiles inside the grid (Turn string into Tiles, GuessColor etc...)
 *
 * @author dottc , lionete
 * @version 2.0
 */
public class Tiles {
    /** Character in the tiles. */
    private final char  charac;
    /** Tiles guessColor. */
    private GuessColor guessColor;

    /** Make a tile with a given guessColor. */
    public Tiles(GuessColor guessColor, char c) {
        this.charac = c;
        this.guessColor = guessColor;
    }
    /** Make a Tile with the "NEUTRAL" guessColor. */
    public Tiles(char c) {
        this(GuessColor.NEUTRAL, c);
    }

    /** Get the tile guessColor. */
    public GuessColor getColor() {
        return this.guessColor;
    }

    /** Set the tile guessColor after check. */
    public void setColor(GuessColor newcolor) {
        this.guessColor = newcolor;
    }

    @Override
    public String toString() {
        return String.format("%s(%c)", guessColor, charac);
    }
    
    /** Get the char of the tiles**/
    public char getChar() {
    	return this.charac;
    }
}
