/**
 * @author Yu-Hsuan Huang
 * 
 * Calculate the time when do something
 *  
 */
package pers.sample.tutorial.timing;

public class TimingExample {

	public static void main(String[] args) {
		//start time
		long startTime = System.currentTimeMillis();
		
		//TODO something
		for(int i=0; i<1000000; i++) {
			for (int j =0; j<1000000; j++) {
				//nothing
			}
		}
		
		//end time
		long endTime = System.currentTimeMillis();
		
		//how many time spend
		long totalTime = endTime - startTime;
		System.out.println("Using Time: " + totalTime + " millionsecond");
	}
	
}
