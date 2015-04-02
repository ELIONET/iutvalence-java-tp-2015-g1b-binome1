package fr.iutvalence.moturf.motus;

/**
 * Classe permettant de manipuler les couleurs Vert/orange
 * @author Clément DOTT
 *
 */

//TODO Revoir la notation des couleurs (Bool? Int?)
public class Couleur {
	
	/**
	 * Couleur Verte lorsque la lettre est dans le mot et bien placée
	 */
	public final static int VERT = 1;
	
	/**
	 * Couleur Orange lorsque la lettre est dans le mot, mais mal placée
	 */
	public final static int ORANGE = 2;
	
	/**
	 * Pas de couleur si la lettre n'est pas dans le mot
	 */
	public final static int NEUTRE = 3;
}
