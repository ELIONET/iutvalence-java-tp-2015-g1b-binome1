package fr.iutvalence.moturf.motus;

/**
 *
 * 
 * @author dottc, lionete
 * @version 2.0.0
 */
public class Player {

	/**
	 * Default score
	 * 
	 */
	
	public static final int DEFAULT_SCORE = 0;
	
	/**
	 * Player's name
	 * 
	 */
	
	public final String name;
	
	/**
	 *  Score
	 * 
	 */
	
	public int score;

	/**
	 * Set player's name and default score
	 * 
	 * @param n
	 */
	public Player(String n) {
		name = n;
		score = DEFAULT_SCORE;
	}

	/**
	 * 
	 * Get player's name
	 * @return
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * Set player's score
	 */
	
	public void setScore(){
		this.score = this.score+1;
	}

	/**
	 * 
	 * Get player's score
	 * @return
	 */
	
	public int getScore() {
		return score;
	}
}
