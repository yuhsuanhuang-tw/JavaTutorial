/**
 * @author Yu-Hsuan Huang
 * 
 * How to use Exception structure
 * try ... catch ... finally
 * 
 */
package pers.sample.tutorial.exception;

public class ExceptionExample {
	
	public static void main(String[] args) {
		
		// NumberFormatException
		try {
			String str = "123"; //Correct Test
//			String str = "123a"; //Incorrect Test
			Long tmp = Long.valueOf(str);
			System.out.println(tmp);
		} catch(NumberFormatException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			// finally will always be executed before finish
			System.out.println("end");
		}
		
	}
	
}
