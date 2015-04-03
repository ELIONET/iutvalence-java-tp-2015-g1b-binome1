package fr.iutvalence.moturf.motus;

/**
 * Couleurs de la case.
 *
 * @author Clément DOTT
 * @version TODO
 */
//TODO Revoir la notation des couleurs (Bool? Int?) Réponse d'Anthony : pourquoi pas un enum ???
public class Couleur {
    /** Couleur Verte lorsque la lettre est dans le mot et bien placée. */
    public static final int VERT   = 1;
    /** Couleur Orange lorsque la lettre est dans le mot, mais mal placée. */
    public static final int ORANGE = 2;
    /** Pas de couleur si la lettre n'est pas dans le mot. */
    public static final int NEUTRE = 3;
}
