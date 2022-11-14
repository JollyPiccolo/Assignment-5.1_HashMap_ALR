/**
 * 
 */
import java.util.HashMap;
/**
 * @author AdelineLR
 *
 */
public class stringDict {
	/**
	 * Variable Instantiation
	 */
	
	HashMap<String, String> dictionary = new HashMap<String, String>(); 
	
	/**
	 * Constructor
	 */
	
	public stringDict() {
		
	}
	
	/**
	 * add method
	 * adds an item and it's key to the dictionary
	 * @param String key, String data
	 */
	
	public void add(String key, String data) {
		dictionary.put(key, data);
	}
	
	/**
	 * remove method
	 * removes an item from the dictionary
	 * @param String Key
	 * @return String 
	 */
	public String remove(String key) {
		return dictionary.remove(key);
	}
	
	/**
	 * get method
	 * returns the data associated with a specific key
	 * @param String key
	 * @return String
	 */
	
	public String getValue(String key) {
		return dictionary.get(key);
	}
	
	/**
	 * getCode method
	 * returns the hashcode associated with a key
	 * @param String key
	 * @return int code
	 */
	
	public int getCode(String key) {
		return key.hashCode();
	}
	
	/**
	 * contains Method
	 * returns a boolean - true if the string is found, false if not
	 * @param String key
	 * @return boolean result
	 */
	
	public boolean contains(String key) {
		boolean result = false;
		result = dictionary.containsKey(key);
		return result;
	}
	
	/**
	 * getKeyIterator method
	 * returns the key associated with a piece of data
	 * @param String key
	 * @return String result
	 */
	
	public String getKey(String data) {
		String result = "No Key Found";
		for(String count: dictionary.keySet()) {
			if(data == dictionary.get(count)) {
				result = count;
				return result;
			}
		}
		return result;
	}
	
	/**
	 * getValueIterator method
	 * returns the value associated with a key, through an iteration through the dictionary
	 * @param String key
	 * @return String result
	 */
	
	public String getValueIterator(String key) {
		String result = "No Data Found";
		for(String count: dictionary.keySet()) {
			if(key == count) {
				result = dictionary.get(count);
				return result;
			}
		}
		return result;
	}
	
	/**
	 * isEmpty method
	 * returns a boolean - true if the dictionary is empty, false if not
	 * @return boolean
	 */
	
	public boolean isEmpty() {
		return dictionary.isEmpty();
	}
	
	/**
	 * getSize method
	 * returns the size of the dictionary as an integer
	 * @return int size
	 */
	
	public int getSize() {
		return dictionary.size();
	}
	
	/**
	 * clear method
	 * clears the dictionary
	 */
	
	public void clear() {
		dictionary.clear();
	}
	
	/**
	 * print method
	 * prints every item in the dictionary
	 */
	
	public void print() {
		for (String count : dictionary.keySet()) {
			System.out.println("Word: " + count + "; Definition: \"" + dictionary.get(count) + "\"");
			}
	}
	
	/**
	 * getAll method
	 * prints the key, data, and hashcode of an object with a given key
	 * @param String key
	 */
	
	public void printAll(String key) {
		String data = dictionary.get(key);
		int hash = key.hashCode();
		
		System.out.println("Word: " + key + "; Definition: \"" + data + "\" ; HashCode: " + hash);
		
	}
	
}
