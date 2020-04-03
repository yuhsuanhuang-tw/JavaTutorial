/**
 * @author Yu-Hsuan Huang
 * 
 * An interface is a completely "abstract class" that is used to group related methods with empty bodies.
 * 
 * Check the class by this order:
 *  1. SkillInterface
 *  2. AnimalInterface
 *  3. HumanInterface
 *  4. ImplementsClass
 *  5. InterfacesExample 
 * 
 */
package pers.sample.tutorial.interfaces;

public class InterfacesExample {
	
	public static void main(String[] args) {
		ImplementsClass impl = new ImplementsClass();
		impl.eat();
		impl.makeTool();
		
		System.out.println();
		impl.draw();
		impl.coding();
	}

}
