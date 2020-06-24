/**
 * @author Yu-Hsuan Huang
 */
package pers.sample.tutorial.list;

public class Person {

	private String name;
	private int grade;
	
	//Constructors
	public Person() {}
	
	public Person(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
