/**
 * @author Yu-Hsuan Huang
 * 
 * 1.
 * Abstract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class)
 * Abstract method can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
 * 
 */
package pers.sample.tutorial.abstracts;

public abstract class ParentsAbstractClass {

	public String role;
	
	public abstract void setRole(String role);
	
	public void printRole() {
		System.out.println("Role: " + role);
	}
	
}
