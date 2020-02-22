/**
 * @author Yu-Hsuan Huang
 * 
 * Please see setInfo Method.
 * setInfo Methods have same name, but different amount of arguments OR different type of arguments
 * 
 */
package pers.sample.tutorial.overload;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		name = "unknow";
		age = 0;
	}
	
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	
	// overload sample 1 
	public void setInfo(String name) {
		this.name = name;
	}
	
	//overload sample 2
	public void setInfo(int age) {
		this.age = age;
	}
	
	//overload sample 3
	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}
