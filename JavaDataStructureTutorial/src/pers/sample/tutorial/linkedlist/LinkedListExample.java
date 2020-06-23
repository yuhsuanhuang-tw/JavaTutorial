/**
 * 
 * @author Yu-Hsuan Huang
 * 
 * Similar to arrays in Java, LinkedList is a linear data structure. 
 * However LinkedList elements are not stored in contiguous locations like arrays, they are linked with each other using pointers. 
 * Each element of the LinkedList has the reference(address/pointer) to the next element of the LinkedList.
 * 
 * 
 */
package pers.sample.tutorial.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		//Initialize linked list
		LinkedList<String> linkedList = new LinkedList<String>();
		
		//Normally add elements
		linkedList.add("Winnie");
		linkedList.add("Yu-Hsuan Huang");
		linkedList.add("Sean");
//		iteratingLinkedList(linkedList);
		
		//Adding the element on first
		linkedList.addFirst("John");
//		iteratingLinkedList(linkedList);
		
		//Adding the element on last
		linkedList.addLast("Jeff");
//		iteratingLinkedList(linkedList);
		
		//Adding an element to the 3rd position
		linkedList.add(2, "Lai");
//		iteratingLinkedList(linkedList);
		
		
		//Removing element
		//Removing the first element
		linkedList.removeFirst();
//		iteratingLinkedList(linkedList);
		
		//Removing the last element
		linkedList.removeLast();
//		iteratingLinkedList(linkedList);
		
		//It will remove the first element
		linkedList.remove();
//		iteratingLinkedList(linkedList);
		
		//It will remove the specific element
		linkedList.remove("Yu-Hsuan Huang");
//		iteratingLinkedList(linkedList);
		
		//Empty the linked list
		linkedList.clear();
//		iteratingLinkedList(linkedList);
		
	}
	
	/**
	 * Iterating LinkedList
	 */
	public static void iteratingLinkedList(LinkedList<String> list) {
	     Iterator<String> iterator=list.iterator();
	     
	     while(iterator.hasNext()){
	       System.out.println(iterator.next());
	     }

	}
	
}
