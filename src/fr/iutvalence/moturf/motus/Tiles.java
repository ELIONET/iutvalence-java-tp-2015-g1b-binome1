package fr.iutvalence.moturf.motus;

/*
 * 
 * 
 */

public class Tiles {
	/**
	 * Tiles color
	 */
	private final Color color;

	/**
	 * Character in the tiles
	 */

	private final char charac;

	/**
	 * Construire une case de couleur donnée.
	 *
	 * @param color
	 *            la couleur voulue
	 */
	public Tiles(Color color, char c) {
		this.charac = c;
		this.color = color;
	}

	/** Obtenir la couleur de la case. */
	public Color getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return String.format("%s(%c)", color, charac);
	}
}
