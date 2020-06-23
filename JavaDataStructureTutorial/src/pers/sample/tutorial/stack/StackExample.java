/**
 * 
 * @author Yu-Hsuan Huang
 * 
 * You should understand linked list first.
 * 
 * Stack A stack is a linear data structure in which 
 * 	elements can be inserted and deleted only from one side of the list, called the top.
 * 
 * A stack follows the LIFO (Last In First Out) principle
 * 
 * The insertion of an element into stack is called "push" operation, and deletion of an element from the stack is called "pop" operation
 * 
 * Applications: 
 * 	1. Converting a decimal number into a binary number
 * 	2. Parsing
 * 	3. Expression Conversion(Infix to Postfix, Postfix to Prefix etc)
 * 	4. Towers of Hanoi
 * 	5. Rat in a Maze solving
 * 
 */
package pers.sample.tutorial.stack;

import java.util.LinkedList;

public class StackExample {

	public static void main(String[] args) {
		
		LinkedList<String> stack = new LinkedList<String>();
		
		//push
		//add() - Appends the specified element to the end of this list.
		stack.add("Winnie");
		stack.add("Lai");
		stack.add("Yu-Hsuan Huang");

		//pop
		//removeLast() - Removes and returns the last element from this list.
		System.out.println(stack.removeLast());
		System.out.println(stack.removeLast());
		System.out.println(stack.removeLast());
		
		//another way to achieve stack
		//use Stack class
		
	}
	
}
