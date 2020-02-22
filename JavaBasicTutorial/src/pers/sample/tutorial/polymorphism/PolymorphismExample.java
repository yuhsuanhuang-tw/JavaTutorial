/**
 * @author Yu-Hsuan Huang
 * 
 * Please learn Overload, Override, Polymorphism together.
 * Before Learning you should know "Inheritance" first.
 * 
 */
package pers.sample.tutorial.polymorphism;

public class PolymorphismExample {
	
	public static void main(String[] args) {
		
		//This Declare call Polymorphism
		//Use Supertype type to instantiate the subtype object
		
		//Polymorphism Example 1
		Animal dog = new Dog();
		dog.sound();
		
		//Polymorphism Example 2
		Animal cat = new Cat();
		cat.sound();
	}
	
}
