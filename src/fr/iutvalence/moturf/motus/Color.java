package fr.iutvalence.moturf.motus;

/**
 * Case color
 *
 * @author dottc, lionete
 * @version 2.0.0
 */


public enum Color {
	/**
	 * 
	 * Color = Green when the char is on the right position
	 * 
	 */
	GREEN("G"),
	
	/**
	 * 
	 * Color = Orange when the char is part of the Secret word but not at the right position
	 * 
	 */
	
	ORANGE("O"),
	
	/**
	 * 
	 * Color = Neutral when the char is not in the Secret word or when the char counter 
	 * exceed the total number of occurrence of this char in the secret.
	 * 
	 */
	
	NEUTRAL("N");

}
