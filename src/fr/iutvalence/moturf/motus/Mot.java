package fr.iutvalence.moturf.motus;

public class Mot {
	//TODO Modifier et remplacer des attributs (certains sont surement faux) et compléter la classe
	/**
	 * Mot du dictionnaire à trouver
	 */
	
	public final String mot;
	
	/**
	 * Caractère courant du mot entré
	 */
	
	public char car_cour;
	
	/**
	 * Caractère courant du mot du dictionnaire
	 */
	public char car_mot;
	
	/**
	 * Booléen qui définit si le caractère est à la bonne position
	 */
	
	public Boolean bonnepos;
	
	/**
	 * Booléen qui définit si le caractère est à la mauvaise position
	 */
	
	public Boolean mauvaisepos;
	
	/**
	 * Mot entré par l'utilisateur
	 * @param m
	 */

	public Mot(String m){
		
		this.mot = m;
		
	}
	
	/**
	 * Fonction qui parcourt une première fois le mot du dico (Mots placé au bon endroit)
	 */

	public void veri1(){
		
			
	}
	
	/**
	 * Fonction qui parcourt une seconde fois le mot du dico (Mots mal placés)
	 */
	
	public void verif2(){
		
	}
	
}
