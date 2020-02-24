package pers.sample.tutorial.random;

import java.util.Random;
/**
 * @author Yu-Hsuan Huang
 * 
 * How to create random numbers
 * 
 */
public class RandomExample {

	public static void main(String[] args) {
		RandomExample.createRandom1();
		RandomExample.createRandom2();
	}
	
	/**
	 * Using java.util.random
	 */
	public static void createRandom1() {
		//Random random = new Random(seed)
		Random rand = new Random(System.currentTimeMillis());
		// from 1 to 100
		System.out.println(rand.nextInt(100));
	}
	
	/**
	 * Using Math.random()
	 */
	public static void createRandom2() {
		//create 0 >= num < 1 number
		//from 0 to 0.9999-
		System.out.println(Math.random());
	}
}
