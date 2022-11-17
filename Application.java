/**
 * 
 */
import java.io.*;
import java.util.Scanner;
/**
 * @author AdelineLR
 *
 */

public class Application{
	public static void main(String[] args) throws IOException{
		
		/**
		 * Variable Instantiation
		 */
		stringDict dictionary = new stringDict();
		Scanner read = new Scanner(new File("DictionaryWordValuePairs.txt"));
		String word;
		
		String def;
		
		/**
		 * add test - placing the words into the dictionary
		 */
		while(read.hasNext()) {
			word = read.next();
			
			def = read.nextLine();
			
			dictionary.add(word, def);
		}

		/**
		 * print test - print the dictionary
		 */
		
		dictionary.print();
		
		/**
		 * search tests - searching for various words, and printing them out alongside their search key
		 */
		
		System.out.println("\nSearch Test: ");
		
		dictionary.printAll("meet");
		dictionary.printAll("appetency");
		dictionary.printAll("sooth");
		dictionary.printAll("mage");
		dictionary.printAll("overset");
	}
}