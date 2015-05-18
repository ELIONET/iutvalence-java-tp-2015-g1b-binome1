package fr.iutvalence.moturf.motus;

/**
 *Grid class
 *
 * @author dottc, lionete
 * @version 2.0
 */
public class Grid {
    /** Number of lines on the grid. */
    public static final int NB_LINES   = 7;
    /** Number of columns on the grid. */
    public static final int NB_COLUMNS = 8;
    /** Create a 2D table which contains references to tiles objects. */
    private final Tiles[][] tiles;

    /** Create the grid with the default line and column values. */
    public Grid() {
        this.tiles = new Tiles[NB_LINES][NB_COLUMNS];
    }

    /**
     * Allows to create the grid.
     */
    public String toString(final int n) {
        String total = "";
        for (int line = 0; line < (n+1); line++) {
            for (int column = 0; column < NB_COLUMNS; column++) {
                total += "|"+ tiles[line][column].getColor()+ ": " + tiles[line][column].getChar();
            }
            total += "| \n";
        }
        /* Total is the whole grid */
        return total;
    }

    /**
     * Set a line with an attempt.
     */
    public void setLine(final int n, final Tiles[] attemptplayer) {
        for (int i = 0; i < attemptplayer.length; i++) {
        	tiles[n][i] = attemptplayer[i];
        }
    }
}
