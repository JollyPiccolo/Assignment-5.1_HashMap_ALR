/**
 * 
 */

/**
 * @author AdelineLR
 *
 */

public class Application{
	public static void main(String[] args) {
		
		/**
		 * Variable Instantiation
		 */
		stringDict dictionary = new stringDict();
		
		/**
		 * add test - placing the words into the dictionary
		 */
		
		dictionary.add("Bane", "Poison");
		dictionary.add("Disport", "Frolic");
		dictionary.add("Forfend", "To Avert or Protect");
		dictionary.add("Hie", "To Go Quickly");
		dictionary.add("Knave", "A Dishonest or Unscrupulous Man");
		
		/**
		 * print test - print the dictionary
		 */
		
		dictionary.print();
		
		/**
		 * search tests - searching for various words, and printing them out alongside their search key
		 */
		
		System.out.println("\nSearch Test: ");
		
		dictionary.printAll("Bane");
		dictionary.printAll("Disport");
		dictionary.printAll("Forfend");
		dictionary.printAll("Hie");
		dictionary.printAll("Knave");
	}
}