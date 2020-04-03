/**
 * @author Yu-Hsuan Huang
 * 
 * Data abstraction is the process of hiding certain details and showing only essential information to the user.
 * 
 * Check the class by this order:
 * 	1. ParentsAbstractClass
 *  2. AbstractClass
 *  3. ExtendsClass
 *  4. AbstractsExample
 * 
 */
package pers.sample.tutorial.abstracts;

public class AbstractsExample {

	public static void main(String[] args) {
		
		/**
		 * Error: Instantiate abstract class (because it is abstract class)
		 */
		//ParentsAbstractClass p = new ParentsAbstractClass();
		//AbstractClass a = new AbstractClass();
		
		/**
		 * Correct: Instantiate class which extends abstract class
		 */
		ExtendsClass e = new ExtendsClass();
		e.printHello();
		e.printName("Yu-Hsuan");
		
		System.out.println();
		e.printRole();
		e.setRole("Human");
		e.printRole();

		System.out.println();
		e.printAge();
		e.updateAge(18);
		e.printAge();

		System.out.println();
		e.printAddr();
		e.updateAddr("Taoyuan");
		e.printAddr();
	}
	
}
