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

    /* TODO Achieve this method for the next session
    /* TODO JAVADOC. */
    public Tiles[] check(final String attempt) {
        int counterOfThisLetterInSecret;
        int counterOfThisLetterInAttempt ;
        Tiles[] tilesattempt = stringToTilesArray(attempt);
        for (int y = 0; y < attempt.length(); y++) {
            // TODO Warning !!! You compare refs not values !
            if (tilesattempt[y] == secret[y]) {
                tilesattempt[y].setColor(Color.GREEN);
            }
            for (int x = 0; x < attempt.length(); x++) {
                if (tilesattempt[y].getColor() == Color.NEUTRAL) {
                	counterOfThisLetterInSecret = 0;
                	counterOfThisLetterInAttempt = 0;
                    for (int z = 0; z < secret.length; z++) {
                        // TODO Warning !!! You compare refs not values !
                        if (tilesattempt[y] == secret[z]) {
                            counterOfThisLetterInSecret++;
                        }
                        for (int w = 0; w < y; w++){
                        	if (tilesattempt[w]==tilesattempt[y]){
                        		counterOfThisLetterInAttempt++;
                        	}
                        	if(counterOfThisLetterInAttempt<=counterOfThisLetterInSecret){
                        		tilesattempt[y].setColor(Color.ORANGE);}                        	
                        	else{
                        		tilesattempt[y].setColor(Color.NEUTRAL);}
                        }
                        
                    }  
                    
                }
                
            }
            // TODO Vérifier la concordance entre t et secret en modifiant t

        }

        return tilesattempt;
    }
}
