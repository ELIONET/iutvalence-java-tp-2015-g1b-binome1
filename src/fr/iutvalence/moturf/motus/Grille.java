package fr.iutvalence.moturf.motus;

public class Grille {
//TODO définir la grille
	
	private static final int NOMBRE_DE_LIGNES = 7;
	private static final int NOMBRE_DE_COLONNES = 8;
	
	private Cases[][] cases;
	
	public Grille(){
		
		this.cases = new Cases[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];
	}
}
