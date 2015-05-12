package fr.iutvalence.moturf.motus;

/**
 * TODO JAVADOC. Grid class
 *
 * @author dottc, lionete
 * @version 1.1
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

    
    @Override
    public String toString() {
        // TODO StringBuilder
        String total = "";
        for (int line = 0; line < NB_LINES; line++) {
            for (int column = 0; column < NB_COLUMNS; column++) {
                total += "|" + tiles[line][column];
            }
            total += "| \n";
        }
        return total;
    }

    /* total is the whole grid */
    public void setLine(final int n, final Tiles[] attemptplayer) {
        for (int i = 0; i < attemptplayer.length; i++) {
        	tiles[n][i] = attemptplayer[i];
        }
    }
}
