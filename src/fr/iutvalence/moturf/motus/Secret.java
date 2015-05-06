package fr.iutvalence.moturf.motus;

/**
 * TODO JAVADOC. Secret Word class
 *
 * @author dottc , lionete
 * @version 1.0
 */

public class Secret {
	/* Secret Word */
	private final Tiles[] secret;

	/* Turn secret word from tiles to string */
	public Secret(final String secret) {

		this.secret = stringToTilesArray(secret);
	}

	/* TODO JAVADOC. */
	public Tiles[] check(final String attempt) {
		int counterOfThisLetter= 0;
		int counter = 0;
		Tiles[] tilesattempt = stringToTilesArray(attempt);
		for(int y = 0; y < attempt.length();y++){      	
			if(tilesattempt[y]==secret[y]){
				tilesattempt[y].setColor(Color.GREEN);}
			for(y = 0; y < attempt.length(); y++){  
				if(tilesattempt[y].getColor()==Color.NEUTRAL){
					for(int z = 0; z < secret.length; z++){
						if(tilesattempt[y]==secret[z]){
							counterOfThisLetter++;
						}
					for(z = 0; z <
					}
					while(counter < secret.length && tilesattempt[y] != secret[counter]){
						counter++;
						if(counter<secret.length){
							tilesattempt[y].setColor(Color.ORANGE);
						}
					}       			
				}
			}
			// TODO Vérifier la concordance entre t et secret en modifiant t
			return tilesattempt;
		}

	private static Tiles[] stringToTilesArray(final String s) {
		Tiles[] array = new Tiles[s.length()];
		for (int i = 0; i < s.length(); i++) {
			array[i] = new Tiles(s.charAt(i));
		}

		return array;
	}
}
