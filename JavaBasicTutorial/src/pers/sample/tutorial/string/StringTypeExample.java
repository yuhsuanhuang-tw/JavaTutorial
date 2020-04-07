/**
 * @author Yu-Hsuan Huang
 * 
 * Compare String, StringBuffer and StringBuilder.
 * 
 * Best to use StringBuilder: Check below to know why
 * 
 */
package pers.sample.tutorial.string;

public class StringTypeExample {

	public static void main(String[] args) {
		
		
		/**
		 * operating speed:
		 * StringBuilder > StringBuffer > String
		 * 
		 * String is most slow because String is immutable.
		 * It means String class will created new string even you use concatenation.
		 */
		
		//String is immutable.
		String str1 = "string value";
		String str2 = "string value"; //It will point memory address same as str1
		String str3 = new String("string value"); //It will instantiate new object.

		System.out.println("Memory Address:");
		System.out.println("@" + Integer.toHexString(System.identityHashCode(str1)));
		System.out.println("@" + Integer.toHexString(System.identityHashCode(str2)));
		System.out.println("@" + Integer.toHexString(System.identityHashCode(str3)));
		
		//String equal example
		System.out.println("\nString Equal Example:");
		if(str1 == str2)
			System.out.println("str1 and str2 point out same memory address, so using (==) they are equal.");
		if(str1 != str3)
			System.out.println("str1 and str3 point out different memory address, so using (!=) they are not equal.");
		if(str1.equals(str2))
			System.out.println("str1 and str2 have same content, so using (equals mehtod) they are equal.");
		if(str1.equals(str3))
			System.out.println("str1 and str3 have same content, so using (equals mehtod) they are equal.");
		
		
		
		//Both StringBuffer and StringBuilder are mutable objects.
		/**
		 * Different between StringBuffer and StringBuilder.
		 * 
		 * StringBuffer is synchronized, StringBuilder is not.
		 * So, StringBuilder is faster than StringBuffer because it's not synchronized.
		 * 
		 * Simply use StringBuilder unless you really are trying to share a buffer between threads.
		 */
		
		//Test change StringBuilder and check memory address
		System.out.println("\nStringBuilder modify example:");
		StringBuilder strBud = new StringBuilder("string value");
		System.out.println(strBud + ":" + "@" + Integer.toHexString(System.identityHashCode(strBud)));
		strBud.append(" by StringBuilder");
		System.out.println(strBud + ":" + "@" + Integer.toHexString(System.identityHashCode(strBud)));
		
		//Test change StringBuffer and check memory address
		System.out.println("\nStringBuffer modify example:");
		StringBuffer strBuf = new StringBuffer("string value");
		System.out.println(strBuf + ":" + "@" + Integer.toHexString(System.identityHashCode(strBuf)));
		strBud.append(" by StringBuilder");
		System.out.println(strBuf + ":" + "@" + Integer.toHexString(System.identityHashCode(strBuf)));
		
	}
	
}
