/**
 * 
 */
package com.demo.lambda;

/**
 * @author KVASIM
 *
 */
public class MethodReferenceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Thread t= new Thread(()->printMessage());
		//Method Reference
		Thread t= new Thread(MethodReferenceExample :: printMessage);
		t.start();
	}

	private static void printMessage() {
		System.out.println("Hello");
	}

}
