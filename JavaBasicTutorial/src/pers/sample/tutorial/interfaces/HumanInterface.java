/**
 * @author Yu-Hsuan Huang
 * 
 * This interface extends AnimalInterface
 * 
 */
package pers.sample.tutorial.interfaces;

public interface HumanInterface extends AnimalInterface {
	
	public String tool1 = "weapon";
	
	public abstract void makeTool();
	// public void makeTool();

}
