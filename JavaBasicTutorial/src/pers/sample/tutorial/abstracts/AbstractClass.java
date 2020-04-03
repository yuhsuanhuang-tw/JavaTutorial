/**
 * @author Yu-Hsuan Huang
 * 
 * Abstract class must be inherited to use 
 * 
 * 2. This class extends ParentsAbstractClass
 * 
 */
package pers.sample.tutorial.abstracts;

public abstract class AbstractClass extends ParentsAbstractClass {
	
	public int age = 18;
	public String addr;
	
	public abstract void printHello();
	
	public void printName(String name) {
		System.out.println("Hello " + name);
	}
	
	public void printAge() {
		System.out.println("Age : " + age);
	}
	
	public void printAddr() {
		System.out.println("Address : " + addr);
	}

}
