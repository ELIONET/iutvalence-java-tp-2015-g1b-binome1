package fr.iutvalence.moturf.motus;

/* TODO JAVADOC */
public class Joueur {
    //TODO Compl�ter la classe 
    /** Score de base du joueur. */
    public static final int SCORE_PAR_DEFAUT = 0;
    /** Nom du joueur. */
    public final String nom;
    /** Score actuel du joueur. */
    public       int    score;

    /** Constructeur du joueur par son nom. */
    public Joueur(String n) {
        nom = n;
        score = SCORE_PAR_DEFAUT;
    }

    /** Affichage du nom du joueur. */
    public String obtenirNom() {
        return nom;
    }

    /** Affichage du score du joueur. */
    public int obtenirScore() {
        return score;
    }
}
