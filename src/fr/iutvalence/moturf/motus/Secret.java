package fr.iutvalence.moturf.motus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * TODO JAVADOC. Secret Word class
 *
 * @author dottc , lionete
 * @version 1.0
 */
public class Secret {
	private final static String DEFAULT_SECRET = "MYSECRET";
	/** Secret Word. */
	private final Tiles[] secret;

	/**
	 * Turn the secret word into tiles
	 * */
	public Secret(final String secret) {
		this.secret = stringToTilesArray(secret);
	}

	public static String getRandomSecret() {
		List<String> listofsecrets = new LinkedList<String>();
		BufferedReader br = null;
		boolean error = false;
		try {
			
		br = new BufferedReader(new FileReader("./Dictionnary/listofsecrets.txt"));
		
			String line = br.readLine();

			while (line != null) {
				// The file contains words which are separated with at least one
				// space and sometimes a comma.
				line = line.replace(",", "");
				String[] stringofsecrets = line.split(" ");
				for (String word : stringofsecrets) {
					listofsecrets.add(word);
				}
				line = br.readLine();
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Impossible to read the file");
			error = true;
		}
		
		finally {
			
			try {
				br.close();
			} catch (IOException e) {
				System.err.println("Erreur");
			}
		}
		if(!error && listofsecrets.size()!=0){
			int randomvalue = (int)(Math.random() * (listofsecrets.size()-1));
			System.out.println(listofsecrets.get(randomvalue));
			return listofsecrets.get(randomvalue);
		}
		return Secret.DEFAULT_SECRET;
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

				tilesattempt[i]
						.setColor(counterAttempt <= counterSecret ? Color.ORANGE
								: Color.NEUTRAL);
			}
		}

		return tilesattempt;
	}
}
