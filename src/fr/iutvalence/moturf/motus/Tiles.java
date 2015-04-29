package fr.iutvalence.moturf.motus;

/**
 * TODO JAVADOC. Tiles class
 *
 * @author dottc , lionete
 * @version TODO
 */
public class Tiles {
    /** Tiles color. */
    private final Color color;
    /** Character in the tiles. */
    private final char  charac;

    /** Make a tile with a given color. */
    public Tiles(Color color, char c) {
        this.charac = c;
        this.color = color;
    }

    /** Get the tile color. */
    public Color getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return String.format("%s(%c)", color, charac);
    }
}
