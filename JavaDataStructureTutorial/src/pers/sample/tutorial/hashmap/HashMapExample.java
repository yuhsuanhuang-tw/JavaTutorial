/**
 * @author Yu-Hsuan Huang
 * 
 * Please compare with Hashtable!!!
 * 
 * Hash table based implementation of the Map interface.
 * This implementation provides all of the optional map operations, and permits null values and the null key. 
 * (The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls.)
 * 
 * Tips:
 * 	If you want to make a HashMap thread-safe, use Collections.synchronizedMap().
 * 
 */
package pers.sample.tutorial.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		//Put key and value pair into HashMap
		hashMap.put(111, "Yu-Hsuan");
		hashMap.put(123, "Huang");
		hashMap.put(520, "Winnie");
		hashMap.put(521, "Lai");
		
		hashMap.put(146, "Jeff");
		hashMap.put(146, "Joseph"); //replace
		
		hashMap.put(321, null); //Success
		hashMap.put(null, "John"); //Success
		hashMap.put(323, ""); //Success
		
		
		
		//Get value by key
		System.out.println(hashMap.get(520));
		
		//Get value by key or default value
		System.out.println(hashMap.getOrDefault(123, "Default Value")); //Huang
		System.out.println(hashMap.getOrDefault(124, "Default Value")); //Default Value
		
		//Remove data
		hashMap.remove(323); //If key match removed
		hashMap.remove(321, "Joseph"); //If key and value both match removed

		
		//Iterator HashMap
		//Method - 1 (use Iterator clss)
		System.out.println("\nMethod 1:");
		Iterator<Entry<Integer, String>> it = hashMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) it.next();
			System.out.println("Key : " + entry.getKey() + "\tValue : " + entry.getValue());
		}
		
		//Method - 2 (use forEach method) Recommend!!!
		System.out.println("\nMethod 2:");
		hashMap.forEach((key, value) -> {
		    System.out.println("Key : " + key + "\tValue : " + value);
		});

		//Method - 3 (use entrySet and forEach method) Recommend!!!
		System.out.println("\nMethod 3:");
		hashMap.entrySet().forEach(entry -> {
		    System.out.println("Key : " + entry.getKey() + "\tValue : " + entry.getValue());
		}); 

		//Method - 4 (use for loop)
		System.out.println("\nMethod 4:");
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
		    System.out.println("Key : " + entry.getKey() + "\tValue : " + entry.getValue());
		}
		
	}
	
}
