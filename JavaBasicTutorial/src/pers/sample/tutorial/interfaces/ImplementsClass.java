/**
 * @author Yu-Hsuan Huang
 * 
 * This class implements HumanInterface and SKillInterface.
 * This class which implements interface must write content to abstract method.
 * 
 */
package pers.sample.tutorial.interfaces;

public class ImplementsClass implements HumanInterface, SkillInterface {

	@Override
	public void eat() {
		System.out.println("Eat: " + food1);
	}

	@Override
	public void draw() {
		System.out.println("Make Tool: " + tool1);
	}

	@Override
	public void coding() {
		System.out.println("I can draw");
	}

	@Override
	public void makeTool() {
		System.out.println("I can coding");
	}

}
