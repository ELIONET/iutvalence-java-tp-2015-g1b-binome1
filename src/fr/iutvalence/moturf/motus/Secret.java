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
        int counterOfThisLetter = 0;
        int counter = 0;
        Tiles[] tilesattempt = stringToTilesArray(attempt);
        for (int y = 0; y < attempt.length(); y++) {
            // TODO Warning !!! You compare refs not values !
            if (tilesattempt[y] == secret[y]) {
                tilesattempt[y].setColor(Color.GREEN);
            }
            // TODO y is already your main loop index.
            for (y = 0; y < attempt.length(); y++) {
                if (tilesattempt[y].getColor() == Color.NEUTRAL) {
                    for (int z = 0; z < secret.length; z++) {
                        // TODO Warning !!! You compare refs not values !
                        if (tilesattempt[y] == secret[z]) {
                            counterOfThisLetter++;
                        }
                        while ((z < secret.length) && (tilesattempt[y] != secret[z])) {
                            z++;
                            //TODO : Si counter < nombre de cette lettre déjà vérifié, on met la lettre actuelle en Orange, sinon en "Neutre"
                        }
                    }
                    while ((counter < secret.length) && (tilesattempt[y] != secret[counter])) {
                        counter++;
                        if (counter < secret.length) {
                            tilesattempt[y].setColor(Color.ORANGE);
                        }
                    }
                }
            }
            // TODO Vérifier la concordance entre t et secret en modifiant t

        }

        return tilesattempt;
    }
}
