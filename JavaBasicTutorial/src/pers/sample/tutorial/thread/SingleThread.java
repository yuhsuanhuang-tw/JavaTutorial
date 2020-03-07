/**
 * @author Yu-Hsuan Huang
 * 
 * Single Thread Class
 * 
 */
package pers.sample.tutorial.thread;

public class SingleThread {

	String name;
	
	//Constructor
	public SingleThread(String name) {
		this.name = name;
	}
	
	//state 3: running
	public void run() {
		for(int i=0;i<3;i++) {
			//Spend time between print
			//state 4: wait
			for(int j=0;j<1000000000;j++) {
				for(int k=0;k<1000000000;k++);
			}
			System.out.println(name + " is running.");
		}
	}

}
