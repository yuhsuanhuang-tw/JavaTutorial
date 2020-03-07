package pers.sample.tutorial.thread;

public class MultipleThread extends Thread {

String name;
	
	//Constructor
	public MultipleThread(String name) {
		this.name = name;
	}
	
	//state 3: running
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
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
