package pers.sample.tutorial.permission;

public class PermissionExample {

	/**
	 * Access Control
	 *             Now class, Now packages, Child class, Other packages
	 * public	   y,y,y,y
	 * protected	   y,y,y,n
	 * default	   y,y,n,n
	 * private	   y,n,n,n
	 */
	public String param1 = "public";
	protected String param2 = "protected";
	String param3 = "default";
	private String param4 = "private";
	
	
	/**
	 * Static Variable
	 *  No matter how many object you instantiate from class, there is only one static variable. like, a global variable. 
	 * 	
	 * Static Method
	 *  Static method cannot use the variable which is not static variable in the class.
	 */
	public static String staticParam = "STATIC";
	public static String staticMethod() {
		//Error: not static variable
		//return param3;
		return staticParam;
	}
	
	/**
	 * final variable
	 *  final variable only can be initial once and cannot be modify
	 *  
	 * final method
	 *  final method can be extend but cannot modify the content
	 *  
	 * final class
	 * 	final class cannot be extend
	 */
	public final int int1 = 1;
	final public int int2 = 2;
	
	
	/**
	 * synchronized method only can be access by one thread on same time.
	 */
	public synchronized void getDepositeMoney(int getMoney) {
		//deposite-getMoney
	}
	
	
	/**
	 * transient keyword
	 * 序列化的class包含 transient變數時，JVM會跳過該特定的變數
	 */
	//不會持久化
	//public transient int sortNumber = 7;
	//會持久化
	//public transient int number;
	
	
	/**
	 * A value of volatile variable will force reload this value from share memories when each thread access.
	 */
	public volatile int deposite = 1000000;
	
}
