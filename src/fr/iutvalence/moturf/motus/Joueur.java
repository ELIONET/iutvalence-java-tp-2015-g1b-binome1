package fr.iutvalence.moturf.motus;

public class Joueur {
    //TODO Compléter la classe 
    /**
     * Desc courte : Classe Joueur
     * Desc longue : 
     * @TAG
     */
	
	/**
	 * Score de base du joueur
	 */
    public final static int SCORE_PAR_DEFAUT=0;
    /**
	 * Nom du joueur
	 */
    
    public final String nom;
    
    /**
     * Score actuel du joueur
     */
    
    public int score;
    
    /**
     * Constructeur du joueur
     * @param n
     */
    
    public Joueur(String n){
            
            this.nom = n;
            this.score = SCORE_PAR_DEFAUT;
                            
    }
    
    /**
     * Affichage du nom du joueur
     * @return
     */
    
    public String obtenir_Nom(){
            
            return this.nom;
            
    }
    
    /**
     * Affichage du score du joueur
     * @return
     */
    public int obtenir_Score(){
            
            return this.score;
            
    }
}