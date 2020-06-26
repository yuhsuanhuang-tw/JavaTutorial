/**
 * @author Yu-Hsuan Huang
 * 
 * Please compare with HashMap!!!
 * 
 * This class implements a hash table, which maps keys to values. Any non-null object can be used as a key or as a value.
 * Hashtable is synchronized.
 * Hashtable does not allow null keys or values.
 * 
 */
package pers.sample.tutorial.hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashtableExample {
	
	public static void main(String[] args) {
	
		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		
		//Put key and value pair into HashMap
		hashTable.put(111, "Yu-Hsuan");
		hashTable.put(123, "Huang");
		hashTable.put(520, "Winnie");
		hashTable.put(521, "Lai");
		
		hashTable.put(146, "Jeff");
		hashTable.put(146, "Joseph"); //replace
		
		// hashTable.put(321, null); //Error!!!
		// hashTable.put(null, "John"); //Error!!!
		hashTable.put(323, ""); //Success
		
		
		
		//Get value by key
		System.out.println(hashTable.get(520));
		
		//Get value by key or default value
		System.out.println(hashTable.getOrDefault(123, "Default Value")); //Huang
		System.out.println(hashTable.getOrDefault(124, "Default Value")); //Default Value
		
		//Remove data
		hashTable.remove(323); //If key match removed
		hashTable.remove(321, "Joseph"); //If key and value both match removed

		
		//Iterator HashMap
		//Method - 1 (use Iterator clss)
		System.out.println("\nMethod 1:");
		Iterator<Entry<Integer, String>> it = hashTable.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) it.next();
			System.out.println("Key : " + entry.getKey() + "\tValue : " + entry.getValue());
		}
		
		//Method - 2 (use forEach method) Recommend!!!
		System.out.println("\nMethod 2:");
		hashTable.forEach((key, value) -> {
		    System.out.println("Key : " + key + "\tValue : " + value);
		});

		//Method - 3 (use entrySet and forEach method) Recommend!!!
		System.out.println("\nMethod 3:");
		hashTable.entrySet().forEach(entry -> {
		    System.out.println("Key : " + entry.getKey() + "\tValue : " + entry.getValue());
		}); 

		//Method - 4 (use for loop)
		System.out.println("\nMethod 4:");
		for (Map.Entry<Integer, String> entry : hashTable.entrySet()) {
		    System.out.println("Key : " + entry.getKey() + "\tValue : " + entry.getValue());
		}
	}

}
