package fr.iutvalence.moturf.motus;

/* TODO JAVADOC */
public class Grille {
    /* TODO JAVADOC */
    private static final int NOMBRE_DE_LIGNES   = 7;
    /* TODO JAVADOC */
    private static final int NOMBRE_DE_COLONNES = 8;
    /* TODO JAVADOC */
    private Cases[][] cases;

    /* TODO JAVADOC */
    public Grille() {
        this.cases = new Cases[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];
    }
}
