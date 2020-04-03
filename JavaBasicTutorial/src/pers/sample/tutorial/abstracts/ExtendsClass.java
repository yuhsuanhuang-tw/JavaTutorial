/**
 * @author Yu-Hsuan Huang
 * 
 * Abstract class must be inherited to use 
 * 
 * 3. This class extends AbstractClass.
 * 4. Must write content to abstract method.
 * 
 */
package pers.sample.tutorial.abstracts;

public class ExtendsClass extends AbstractClass {
	
	//Must write content to abstract method. (This method is from AbstractClass)
	@Override
	public void printHello() {
		System.out.println("Hello");
	}

	//Must write content to abstract method. (This method is from ParentsAbstractClass)
	@Override
	public void setRole(String role) {
		super.role = role;
	}
	
	public void updateAge(int age) {
		super.age = age;
	}
	
	public void updateAddr(String addr) {
		super.addr = addr;
	}

}
