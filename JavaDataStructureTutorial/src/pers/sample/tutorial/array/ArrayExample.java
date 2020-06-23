/**
 * 
 * @author Yu-Hsuan Huang
 * 
 * Java data structure - Array
 * 
 * how to declare an array and initialize
 * how to change element
 * how to iterate the all elements
 * 
 */
package pers.sample.tutorial.array;

public class ArrayExample {

	public static void main(String[] args) {
		
		//Declare an array
		String[] array1;
		
		//Declare an array with content
		String[] array2 = {"Yu", "Hsuan", "Huang"};
		
		
		//Access the Elements of an Array
		System.out.println(array2[0]);
		
		//Change an Array Element
		array2[0] = "Sean";
		System.out.println(array2[0]);
		
		//Array Length
		System.out.println(array2.length);
		
		//Loop Through an Array
		//for
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		//for-each
		for(String str : array2) {
			System.out.println(str);
		}
		
		
		
		//Multidimensional Arrays
		int[][] array3;
		int[][] array4 = { {1, 2, 3}, {4, 5, 6} };
		
	}
	
}
