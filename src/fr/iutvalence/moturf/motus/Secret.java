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

	/* TODO JAVADOC. */
	private static Tiles[] stringToTilesArray(final String s) {
		Tiles[] array = new Tiles[s.length()];
		for (int i = 0; i < s.length(); i++) {
			array[i] = new Tiles(s.charAt(i));
		}

		return array;
	}

	/* TODO JAVADOC. */
	public Tiles[] check(final String attempt) {
		Tiles[] tilesattempt = stringToTilesArray(attempt);
		int length = attempt.length();
		
		// TODO Commentaire vert
		for (int i = 0; i < length; i++) {
			if (tilesattempt[i].getChar() == secret[i].getChar()) {
				tilesattempt[i].setColor(Color.GREEN);
			}
		}
		
		// TODO Commentaire orange
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
