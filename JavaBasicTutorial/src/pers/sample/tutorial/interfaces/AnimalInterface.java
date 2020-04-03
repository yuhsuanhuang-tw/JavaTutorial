/**
 * @author Yu-Hsuan Huang
 * 
 * Interface:
 *  1. Interface only has "public" level.
 *  2. All of variables will be transform into "public static final" variables by implicit function in interface.
 *  3. All of methods will be transform into "public abstract" methods by implicit function in interface.
 * 
 */
package pers.sample.tutorial.interfaces;

public interface AnimalInterface {

	public String food1 = "meat";
	public static final String food2 = "fish";
	
	//Error
//	public String food3;
//	private String food4 = "fruit";
	
	public void eat();
	// public abstract void eat();
}
