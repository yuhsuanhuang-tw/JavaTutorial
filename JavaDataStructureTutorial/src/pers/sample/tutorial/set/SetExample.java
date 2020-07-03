/**
 * @author Yu-Hsuan Huang
 * 
 * A collection that contains no duplicate elements and at most one null element.
 * 
 */
package pers.sample.tutorial.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args) {
		
		Set<Integer> integerSet = new HashSet<Integer>();
		//new LinkedHashSet<>()
		//new TreeSet<>()
		
		//Add elements
		integerSet.add(new Integer(111));
		integerSet.add(new Integer(111)); //only be added once
		integerSet.add(new Integer(112));
		integerSet.add(new Integer(520));
		integerSet.add(new Integer(530));
		integerSet.add(new Integer(540));
		
		System.out.println(integerSet.size() + "\n"); //5
		
		
		//Set class don't have get method.
		
		//Check the element in the set
		System.out.println(integerSet.contains(new Integer(520)));
		System.out.println(integerSet.contains(new Integer(522)));
		
		//Iterator set
		//Method - 1
		System.out.println("\nMethod 1:");
		for(Integer integer: integerSet) {
			System.out.println(integer);
		}
		
		//Method - 2
		System.out.println("\nMethod 2:");
		integerSet.forEach((value) -> {
			System.out.println(value);
		});
		
	}

}
