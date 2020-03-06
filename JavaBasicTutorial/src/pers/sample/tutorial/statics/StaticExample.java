/**
 * @author Yu-Hsuan Huang
 * 
 * This sample show the different between static and non-static method
 * 
 */
package pers.sample.tutorial.statics;

public class StaticExample {

	public static void main(String[] args) {
		
		//static method can be use without instantiate the object
		Person.showInfoStatic();
		
		//non-static method must be use after instantiate the object
		Person person = new Person();
		person.showInfo();
	}
	
}
