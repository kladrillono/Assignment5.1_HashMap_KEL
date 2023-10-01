import java.io.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
/**
 * A class that implements a dictionary using a hashmap.
 * A pre-written file is used for the dictionary entries.
 * @author Kendall E. Ladrillono
 *
 */
public class Dictionary {

	private HashMap<Integer, String> dictionary;
	
	/** Creates a new dictionary. */
	public Dictionary() {
		
		dictionary = new HashMap<Integer, String>();
		
	}// end constructor
	
	/** A scanner object is used to read a file and 
	  * adds the contents to Dictionary. */
	public void loadDictionary() throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("DictionaryWordValuePairs.txt"));
		
		while(scan.hasNextLine()) {
			String terms[] = scan.nextLine().split("\t");
			
			dictionary.put(terms[0].hashCode(), terms[1]);
		}
		scan.close();
	}// end loadDictionary
	
	/** Searches through the dictionary for a specific entry. 
	  * @param The key to be searched.
	  * @return The hashkey for the entry, the entry word, and the definition. */
	public String searchDictionary(String key) {
		
		System.out.println("Hashkey: " + key.hashCode());
		System.out.println("Term: " + key);
		return dictionary.get(key.hashCode());
		
	}// end searchDictionary
	
	/**Prints dictionary entries including hashkey and value (definition). */
	public void printDictionary() {
		
		for (Entry<Integer, String> i : dictionary.entrySet()) {
			System.out.println("Key: " + i.getKey() + ", Value: " + i.getValue());
		}
		
	}// end printDictionary
	
}// end class
