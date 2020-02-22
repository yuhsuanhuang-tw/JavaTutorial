/**
 * @author Yu-Hsuan Huang
 * 
 * Please learn Overload, Override, Polymorphism together.
 * 
 */
package pers.sample.tutorial.overload;

public class OverloadExample {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.showInfo();
		
		//Test Overload: setInfo()
		Person person2 = new Person();
		person2.setInfo("Yu-Hsuan");
		person2.showInfo();
		
		//Test Overload: setInfo()
		Person person3 = new Person();
		person3.setInfo(20);
		person3.showInfo();
		
		//Test Overload: setInfo()
		Person person4 = new Person();
		person4.setInfo("Winnie", 18);
		person4.showInfo();
	}
	
}
