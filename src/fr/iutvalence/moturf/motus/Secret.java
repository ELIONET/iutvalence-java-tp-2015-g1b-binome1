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

    /* TODO. */
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
        int counterOfThisLetterInSecret;
        int counterOfThisLetterInAttempt;
        Tiles[] tilesattempt = stringToTilesArray(attempt);
        for (int y = 0; y < attempt.length(); y++) {
            if (tilesattempt[y].getChar() == secret[y].getChar()) {
                tilesattempt[y].setColor(Color.GREEN);
            }
        }
            for (int x = 0; x < attempt.length(); x++) {
                if (tilesattempt[x].getColor() != Color.GREEN) {
                	counterOfThisLetterInSecret = 0;
                	counterOfThisLetterInAttempt = 0;
                    for (int z = 0; z < secret.length; z++) {
                        if (tilesattempt[x].getChar() == secret[z].getChar()) {
                            counterOfThisLetterInSecret++;
                        }
                    }
                        for (int w = 0; w <= x; w++){
                        	if (tilesattempt[x].getChar()==tilesattempt[w].getChar()){
                        		counterOfThisLetterInAttempt++;
                        	}
                        }
                        	if(counterOfThisLetterInAttempt<=counterOfThisLetterInSecret)
                        		tilesattempt[x].setColor(Color.ORANGE);                        	
                        	else
                        		tilesattempt[x].setColor(Color.NEUTRAL);
                        }
                        
                    }  

          return tilesattempt;
    }
}
