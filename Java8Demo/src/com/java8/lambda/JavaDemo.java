/**
 * 
 */
package com.java8.lambda;

/**
 * @author KVASIM
 *
 */
public class JavaDemo {

	/**
	 * @param args
	 */

	private String salary="10";
	private static String address="new Delhi";
	
	
	public static void main(String[] args) {
		JavaDemo demo= new JavaDemo();
		JavaDemo demo1= new JavaDemo();
		JavaDemo demo2= new JavaDemo();
		demo.salary="50";
		demo1.address="Mumbai";
		System.out.println("-- Class variable---"+JavaDemo.address);
		
		System.out.println(demo2.salary);
		//System.out.println("-- instance variable---"+demo.salary);
		
		System.out.println("-- insta in class variable---"+address);
		
	}
	
	public void display(){
		System.out.println("--instance variable in display--"+salary);
		System.out.println();
	}

}
