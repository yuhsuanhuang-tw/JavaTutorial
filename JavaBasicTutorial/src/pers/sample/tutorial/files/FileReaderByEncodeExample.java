/**
 * @author Yu-Hsuan Huang
 * 
 * Understanding how to read a file which assign the encode
 * 
 */
package pers.sample.tutorial.files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileReaderByEncodeExample {

	public static void main(String[] args) {
		String fileData = "";
		String filePath = "/Users/hsuanhuang/Documents/GitHub/JavaTutorial/JavaBasicTutorial/src/pers/sample/tutorial/files/Example.log";
		try {
			BufferedReader objbufReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
			while ((fileData = objbufReader.readLine()) != null) {
				System.out.println(fileData);
			}
			objbufReader.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//TODO close
		}
	}
	
}
