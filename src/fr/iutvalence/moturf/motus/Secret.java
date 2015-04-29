package fr.iutvalence.moturf.motus;

/**
 * TODO JAVADOC. Secret Word class
 *
 * @author dottc , lionete
 * @version 1.0
 */
public class Secret {
    /* Secret Word*/
    private final Tiles[] secret;

    /* Turn secret word from tiles to string */
    public Secret(final String secret) {
        // TODO String secret -> Tiles[] secret.
    }

    /* TODO JAVADOC. */
    public Tiles[] check(final String attempt) {
        Tiles[] t = stringToTilesArray(attempt);
        // TODO Vérifier la concordance entre t et secret en modifiant t
        return t;
    }
    
    private static Tiles[] stringToTilesArray(final String s) {
    	// TODO Convertir String en Tiles[]
    }
}
