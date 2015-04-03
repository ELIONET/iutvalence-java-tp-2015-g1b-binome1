package fr.iutvalence.moturf.motus;

// TODO À quoi sert cette classe ???
/* TODO JAVADOC */
public class Mot {
    //TODO Modifier et remplacer des attributs (certains sont surement faux) et compl�ter la classe
    /**
     * Mot du dictionnaire � trouver
     */
    public final String  mot;
    /**
     * Caract�re courant du mot entr�
     */
    public       char    car_cour;
    /**
     * Caract�re courant du mot du dictionnaire
     */
    public       char    car_mot;
    /**
     * Bool�en qui d�finit si le caract�re est � la bonne position
     */
    public       Boolean bonnepos;
    /**
     * Bool�en qui d�finit si le caract�re est � la mauvaise position
     */
    public       Boolean mauvaisepos;

    /**
     * Mot entr� par l'utilisateur
     */
    public Mot(String m) {
        this.mot = m;
    }

    /**
     * Fonction qui parcourt une premi�re fois le mot du dico (Mots plac� au bon endroit)
     */
    public void veri1() {
    }

    /**
     * Fonction qui parcourt une seconde fois le mot du dico (Mots mal plac�s)
     */
    public void verif2() {
    }
}
