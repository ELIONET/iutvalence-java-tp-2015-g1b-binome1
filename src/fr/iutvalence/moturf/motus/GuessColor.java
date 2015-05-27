package fr.iutvalence.moturf.motus;

/**
 * GuessColor class.
 *
 * @author dottc, lionete
 * @version 2.0.0
 */
public enum GuessColor {
    /**
     * Green when the char is on the right position.
     */
    GREEN("G"),
    /**
     * Orange when the char is part of the Secret word but not at the right position.
     */
    ORANGE("O"),
    /**
     * Neutral when the char is not in the Secret word or when the char counter
     * exceed the total number of occurrence of this char in the secret.
     */
    NEUTRAL("N");

    /**
     *GuessColor representation 
     */
    private final String representation;

    
    /**
     * Get the color representation
     */    
    GuessColor(final String representation) {
        this.representation = representation;
    }

    @Override
    public String toString() {
        return representation;
    }
}

