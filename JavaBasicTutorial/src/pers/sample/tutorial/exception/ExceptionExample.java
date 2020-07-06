/**
 * @author Yu-Hsuan Huang
 * 
 * How to use Exception structure
 * 
 * try ... catch ... finally
 * throws exception
 * 
 */
package pers.sample.tutorial.exception;

public class ExceptionExample {
	
	public static void main(String[] args) {
		

//		String str = "123"; //Correct Test
		String str = "123a"; //Incorrect Test
		
		processExceptionInTryCatch(str);
		
		//If method may throw exception, you should process in where you invoke the method.
		//Otherwise, this exception (error) will cause that shut down your application.
		dontProcessException(str);
	}
	
	//It will process exception in try-catch and print error/warning in Log file
	public static void processExceptionInTryCatch(String str) {
		
		try {
			Long tmp = Long.valueOf(str);
			System.out.println(tmp);
		} catch(NumberFormatException e) { // NumberFormatException
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(Exception e) { // The parent class of all the exception class
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			// finally will always be executed before finish
			System.out.println("end");
		}
		
	}
	
	//It will not process exception. If exception occurs, it will throws the exception to the caller.
	public static void dontProcessException(String str) throws NumberFormatException {
		Long tmp = Long.valueOf(str);
		System.out.println(tmp);
	}
	
}
