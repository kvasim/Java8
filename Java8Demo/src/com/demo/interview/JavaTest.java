/**
 * 
 */
package com.demo.interview;

/**
 * @author KVASIM
 *
 */
public class JavaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JavaTest javaTest=new JavaTest();
		System.gc();
		System.out.println(" This is java test main method");
		
	}
	protected void finalize() {
        System.out.println("Rest in Peace!");
    }
}
