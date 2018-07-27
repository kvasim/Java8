/**
 * 
 */
package com.java.oop;

/**
 * @author KVASIM
 *
 */
public class OOPsDemo extends SuperClass {

	@Override
	public void display(String value){
		System.out.println("This is display method in OOPs Demo=="+value);
	}
	
	
	public static void main(String[] args) {
		OOPsDemo demo= new OOPsDemo();
		demo.display();
	}
}
