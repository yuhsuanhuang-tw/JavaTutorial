/**
 * @author Yu-Hsuan Huang
 * 
 * Understand use the file separator, because it may have different separator in different OS.
 * 
 */
package pers.sample.tutorial.files;

import java.io.File;

public class FileSparatorExample {

	public static void main(String[] args) {
		System.out.println("File.separator = "+File.separator);
		System.out.println("File.separatorChar = "+File.separatorChar);
		System.out.println("File.pathSeparator = "+File.pathSeparator);
		System.out.println("File.pathSeparatorChar = "+File.pathSeparatorChar);
	}
	
}
