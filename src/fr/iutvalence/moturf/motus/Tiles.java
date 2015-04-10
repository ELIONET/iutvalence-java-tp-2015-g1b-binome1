package fr.iutvalence.moturf.motus;

 /**
 * 
 * @author dottc , lionete
 */

public class Tiles {
	/**
	 * Tiles color
	 * 
	 */
	private final Color color;

	/**
	 * Character in the tiles
	 * 
	 */

	private final char charac;

	/**
	 * Make a tile with a given color
	 *
	 * @param color
	 * 
	 */
	public Tiles(Color color, char c) {
		this.charac = c;
		this.color = color;
	}

	/**
	 * Get the case color
	 * 
	 * @return
	 */
	public Color getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return String.format("%s(%c)", color, charac);
	}
}
