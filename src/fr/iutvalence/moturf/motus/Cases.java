package fr.iutvalence.moturf.motus;

import fr.iutvalence.moturf.motus.Couleur;

//TODO finir et corriger les valeurs de la classe
public class Cases {
	
	/**
	 * La couleur de la case
	 */
	
	private final int couleur;
	
	/**
	 * Construire une case de couleur donn�e
	 * 
	 * @param couleur
	 * la couleur voulue
	 */
	
	public Case(int couleur){
		this.couleur=couleur;
	}
	
	/**
	 * Obtenir la couleur de la case
	 * 
	 * @returns
	 */
	public boolean obtenirCouleur()
	{
		return this.couleur;
	}
	
	/**
	 * Retourne une représentation texte de la case, sous la forme d'un symbole "V" si
	 * la lettre est plac�e au bon endroit, O si la lettre est mal plac�e et . si
	 * la lettre n'est pas dans le mot
	 */
	
	public String toString()
	{
		if (this.couleur == Couleur.VERT)
			return " V ";
		if (this.couleur == Couleur.ORANGE)
			return " O ";
		else return car_cour;
	}
	
}
