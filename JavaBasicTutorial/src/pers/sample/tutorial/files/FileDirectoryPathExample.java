/**
 * @author Yu-Hsuan Huang
 * 
 * To understand how to get current path.
 * 
 */
package pers.sample.tutorial.files;

import java.io.File;
import java.io.IOException;

public class FileDirectoryPathExample {

	public static void main(String[] args) {
		try {
			//Get Now Project Absoulte Path
			String path = new File( "." ).getCanonicalPath();
			System.out.println("Current path: " + path);


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
