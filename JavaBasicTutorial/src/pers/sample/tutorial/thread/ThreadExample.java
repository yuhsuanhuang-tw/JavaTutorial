/**
 * @author Yu-Hsuan Huang
 * 
 * 5 statement about thread:
 * 	1. new
 * 	2. ready
 * 	3. running
 * 	4. waiting
 * 	5. terminated
 * 
 */
package pers.sample.tutorial.thread;

public class ThreadExample {

	public static void main(String[] args) {
		//Single Thread Example Test
		SingleThread single = new SingleThread("Subaru");//state 1: new
		//state 2: ready
		single.run();//state 3: running
		//state 5: terminated
		
		System.out.printf("\n\n");
		
		//Multiple Thread Example Test
		MultipleThread multiple1 = new MultipleThread("Toyota");
		MultipleThread multiple2 = new MultipleThread("Honda");
		//state 2: ready
		multiple1.start();//state 3: running
		multiple2.start();//state 3: running
		//state 5: terminated
	}
	
}
