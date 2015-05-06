package fr.iutvalence.moturf.motus;

/**
 * TODO JAVADOC. Grid class
 *
 * @author dottc, lionete
 * @version 1.1
 */
public class Grid {
    /* TODO Private ? */
    /** Number of lines on the grid. */
    static final         int NB_LINES   = 7;
    /** Number of columns on the grid. */
    private static final int NB_COLUMNS = 8;
    /* TODO Final ? */
    /** Create a 2D table which contains references to tiles objects. */
    private Tiles[][] tiles;

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
    public String toString(final int n) {
        // TODO StringBuilder
        String total = "";
        for (int line = 0; line < (n - 1); line++) {
            for (int column = 0; column < NB_COLUMNS; column++) {
                if (tiles[line][column] != null) { total += "|" + tiles[line][column]; }
            }
        }
        total += "|_ _ _ _ _ _ _ _| - Try number " + (n + 1);
        return total;
    }
}
