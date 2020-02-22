/**
 * @author Yu-Hsuan Huang
 * 
 * Please check toString() Method
 * Override: Supertype 's method has been override, so we can re-defined the method content in subtype.
 * 
 */
package pers.sample.tutorial.override;

public class Person {
	
	private String name;
	
	public Person() {
		name = "unknow";
	}
	
	//This Method exist in the supertype
	//We try to override the content in this method.
	@Override
	public String toString() {
		//The existing code: call the super toString() Method
		//return super.toString();
		
		return "My name is " + name + "!!!";
	}

}
