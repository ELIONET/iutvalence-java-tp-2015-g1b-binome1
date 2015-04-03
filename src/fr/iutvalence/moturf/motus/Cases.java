package fr.iutvalence.moturf.motus;

// TODO À quoi sert cette classe si ce n'est qu'une Couleur ? Pourquoi ne pas utiliser directement Couleur ???
//TODO finir et corriger les valeurs de la classe
/* TODO JAVADOC. */
public class Cases {
    /** La couleur de la case. */
    private final int couleur;

    /**
     * Construire une case de couleur donnée.
     *
     * @param couleur la couleur voulue
     */
    public Cases(int couleur) {
        this.couleur = couleur;
    }

    /** Obtenir la couleur de la case. */
    public int obtenirCouleur() {
        return this.couleur;
    }

    /**
     * Retourne une représentation texte de la case.
     * <p>
     * Un symbole 'V' si la lettre est placée au bon endroit, 'O' si la lettre est mal placée et '.' si
     * la lettre n'est pas dans le mot
     */
    /* TODO Pourquoi mettre cela ici ? Et pas dans Couleur ?. */
    @Override
    public String toString() {
        if (this.couleur == Couleur.VERT) { return " V "; }
        if (this.couleur == Couleur.ORANGE) { return " O "; }
        // TODO Qu'est-ce que car_cour ???
        else { return car_cour; }
    }
}
