package fr.iutvalence.moturf.motus;

/**
 * Tiles class
 * This class contains everything to make tiles inside the grid (Turn string into Tiles, Color etc...)
 *
 * @author dottc , lionete
 * @version 2.0
 */
public class Tiles {
    /** Character in the tiles. */
    private final char  charac;
    /** Tiles color. */
    private Color color;

    /** Make a tile with a given color. */
    public Tiles(Color color, char c) {
        this.charac = c;
        this.color = color;
    }
    /** Make a Tile with the "NEUTRAL" color. */
    public Tiles(char c) {
        this(Color.NEUTRAL, c);
    }

    /** Get the tile color. */
    public Color getColor() {
        return this.color;
    }

    /** Set the tile color after check. */
    public void setColor(Color newcolor) {
        this.color = newcolor;
    }

    @Override
    public String toString() {
        return String.format("%s(%c)", color, charac);
    }
    
    /** Get the char of the tiles**/
    public char getChar() {
    	return this.charac;
    }
}
