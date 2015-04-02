package fr.iutvalence.moturf.motus;

public class Joueur {
    
    /**
     * Classe Joueur
     */
    
    public final static int SCORE_PAR_DEFAUT=0;
    
    public final String nom;
    
    public int score;
    
    public Joueur(String n){
            
            this.nom = n;
            this.score = SCORE_PAR_DEFAUT;
                            
    }
    
    public String obtenir_Nom(){
            
            return this.nom;
            
    }
    
    public int obtenir_Score(){
            
            return this.score;
            
    }
}