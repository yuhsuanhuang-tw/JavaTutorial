/**
 * @author Yu-Hsuan Huang
 * 
 * List example includes the ArrayList
 * 
 */
package pers.sample.tutorial.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		
		//List is parents class of ArrayList, LinkedList, Vector
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		List<String> list3 = new Vector<String>();
		
		System.out.println(list1.getClass());
		System.out.println(list2.getClass());
		System.out.println(list3.getClass());
		
		
		//Declare arraylist with elements
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("Winnie", "Yu-Hsuan", "Lai"));
		
		//Adding element
		arrayList.add("Sean");
		arrayList.add(2, "Huang");
		arrayList.addAll(Arrays.asList("Jeff", "John"));
		
		//Removing element
		arrayList.remove(6);
		arrayList.remove("Huang");
		
		//Contain
		arrayList.contains("Winnie");
		
		//Sorting
		Collections.sort(arrayList);
		
		
		System.out.println("\n\n");
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Yu-Hsuan", 87));
		personList.add(new Person("Winnie", 96));
		personList.add(new Person("Brown", 56));
		personList.add(new Person("Annie", 75));
		personList.add(new Person("John", 35));
		personList.add(new Person("Lee", 24));
		
		for(Person p:personList) {
			System.out.println(p.getName() + "\t" + p.getGrade());
		}
		System.out.println("\n\n");
		
		//Sorting with object field
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				//Sort by name
				return o1.getName().compareTo(o2.getName());
				
				//Sort by grade (ASC)
				//Method 1 (data type is not class)
//				if(o1.getGrade() > o2.getGrade()) {
//					return 1;
//				} else if (o1.getGrade() < o2.getGrade()) {
//					return -1;
//				} else {
//					return 0;
//				}
				//Mehtod 2 (data type is class)
//				Integer i1 = new Integer(o1.getGrade());
//				Integer i2 = new Integer(o2.getGrade());
//				return i2.compareTo(i1);
				
				//Sort by grade (DESC)
				//Mehtod 1 (data type is not class)
//				if(o1.getGrade() > o2.getGrade()) {
//					return -1;
//				} else if (o1.getGrade() < o2.getGrade()) {
//					return 1;
//				} else {
//					return 0;
//				}
				//Mehtod 2 (data type is class)
//				Integer i1 = new Integer(o1.getGrade());
//				Integer i2 = new Integer(o2.getGrade());
//				return i1.compareTo(i2);
			}
		});
		
		for(Person p:personList) {
			System.out.println(p.getName() + "\t" + p.getGrade());
		}
		
		
		
	}
	
}
