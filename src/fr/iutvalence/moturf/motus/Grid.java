package fr.iutvalence.moturf.motus;

/**
 *
 * 
 * @author dottc, lionete
 *
 * @version 1.1
 */

public class Grid {
	
    /** 
     * Number of lines on the grid
     * 
     */
	
    private static final int NB_LINES   = 7;
    
    /**
     * Number of columns on the grid
     * 
     */
    
    private static final int NB_COLUMNS = 8;
    
    /**
     * Create a 2D table which contains references to tiles objects
     * 
     */
    
    private Tiles[][] tiles;

    /**
     *Create the grid with the default line and column values
     * 
     */
    
    public Grid() {
        this.tiles = new Tiles[NB_LINES][NB_COLUMNS];
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
    
    
}
