import java.io.FileNotFoundException;
/**
 * A class that simulates a dictionary.
 * @author Kendall E. Ladrillono
 *
 */
public class DictionaryApplication {

	public static void main(String[] args) throws FileNotFoundException {
		
		Dictionary webster = new Dictionary();
		
		/**Test code for adding entries to dictionary.*/
		webster.loadDictionary();
		
		/**Test code for searching for specific words.*/
		System.out.println(webster.searchDictionary("bibliopole"));
		System.out.println(webster.searchDictionary("salamander"));
		System.out.println(webster.searchDictionary("mage"));
		System.out.println(webster.searchDictionary("cicisbeo"));
		System.out.println(webster.searchDictionary("popinjay"));
		
		/**Test code for printing all entries in dictionary.*/
		webster.printDictionary();

	}// end main

}// end class
