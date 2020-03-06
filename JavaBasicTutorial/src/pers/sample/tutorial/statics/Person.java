/**
 * @author Yu-Hsuan Huang
 * 
 * Please check different between static and non-static
 * 
 */
package pers.sample.tutorial.statics;

public class Person {
	
	//static variable v.s. non-static variable
	private static String staticName = "Yu-Hsuan";
	private String name = "Huang";
	
	
	//static method v.s. non-static method
	public static void showInfoStatic() {
		//static method only can use static variable
		System.out.println("Static method: ");
		System.out.println("First Name: " + staticName + "\n");
	}
	
	public void showInfo() {
		//non-static method can use static variable and non-static variable
		System.out.println("Non-static method: ");
		System.out.println("First Name: " + staticName);
		System.out.println("Last Name: " + name + "\n");
	}
	
}
