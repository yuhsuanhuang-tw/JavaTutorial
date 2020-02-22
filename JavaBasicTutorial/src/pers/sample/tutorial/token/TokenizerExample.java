/**
 * @author Yu-Hsuan Huang
 * 
 * How to use different way to separate the string
 * 	1. split
 * 	2. StringTokenizer
 */
package pers.sample.tutorial.token;

import java.util.StringTokenizer;

public class TokenizerExample {

	public static void main(String[] args) {
		final String str = ",5,6,7,,1,2,3";
		TokenizerExample.useSplit(str);
		TokenizerExample.useStringTokenizer(str);
	}
	
	/**
	 * Using split
	 * @param str
	 */
	public static void useSplit(String str) {
		System.out.println("Split");
		String[] strArr = str.split(",");
		System.out.println("strArr Length : " + strArr.length);
		for(String s:strArr) {
			System.out.println(s);
		}
	}
	
	/**
	 * Using StringTokenizer
	 * @param str
	 */
	public static void useStringTokenizer(String str) {
		System.out.println("StringTokenizer");
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("StringTokenizer Count : " + st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
