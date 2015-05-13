package fr.iutvalence.moturf.motus;

/**
 * TODO JAVADOC. Secret Word class
 *
 * @author dottc , lionete
 * @version 1.0
 */
public class Secret {
	/** Secret Word. */
	private final Tiles[] secret;

    /**
     * Turn the secret word into tiles
     * */
    public Secret(final String secret) {
		this.secret = stringToTilesArray(secret);
	}

	/**
	 * Turns a String (Attempt or secret for example) to Array
	 */
	private static Tiles[] stringToTilesArray(final String s) {
		Tiles[] array = new Tiles[s.length()];
		for (int i = 0; i < s.length(); i++) {
			array[i] = new Tiles(s.charAt(i));
		}

		return array;
	}

	/**
	 * Method to check the player's attempt word and the secret word to see if they match.
	 * Also put colors depending the letters in the attempt and secret
	 */
	public Tiles[] check(final String attempt) {
		Tiles[] tilesattempt = stringToTilesArray(attempt);
		int length = attempt.length();
		
		// TODO Commentaire vert
		/**
		 * If the letter is on the same spot in the secret and attempt
		 * It will display G: (For GREEN)
		 */
		for (int i = 0; i < length; i++) {
			if (tilesattempt[i].getChar() == secret[i].getChar()) {
				tilesattempt[i].setColor(Color.GREEN);
			}
		}
		
		// TODO Commentaire orange
		/**
		 * If the letter is not on the same spot in the secret word but in the player's attempt
		 * It will display O: (For ORANGE), else it will display N: (For NEUTRAL)
		 */
		for (int i = 0; i < length; i++) {
			if (tilesattempt[i].getColor() != Color.GREEN) {
				int counterSecret = 0;
				for (int j = 0; j < length; j++) {
					if (tilesattempt[i].getChar() == secret[j].getChar()) {
						counterSecret++;
					}
				}
				
				int counterAttempt = 0;
				for (int j = 0; j < length; j++) {
					// TODO Commentaire sur la subtilité du j <= i
					if (tilesattempt[i].getChar() == tilesattempt[j].getChar()) {
						if (j <= i || tilesattempt[j].getColor() == Color.GREEN) {
							counterAttempt++;
						}
					}
				}
				
				tilesattempt[i].setColor(counterAttempt <= counterSecret ? Color.ORANGE : Color.NEUTRAL);
			}
		}

		return tilesattempt;
	}
}
