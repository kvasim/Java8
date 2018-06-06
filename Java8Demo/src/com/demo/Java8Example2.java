/**
 * 
 */
package com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kvasim
 *
 */
public class Java8Example2 {

	/**
	 * @param args
	 */
	final static String salutation="Hello ";
	public static void main(String[] args) {
		
		demo3();
		
	   }
	
	
	public static void demo3(){

		List<String> list= new ArrayList<String>();
		list.add("Wasim");
		list.add("Shakib");
		list.add("Tanvir");
		list.add("Shamsheer");
		list.forEach(Java8Example2::display);
	}
	
	public static void display(String mesg){
		System.out.println(" "+mesg);
	}
	public static void demo2(){
		GreetingService service = message->
		System.out.println(salutation +message);
		service.sayMessage("Wasim Khan");
		
	}
	
	
	interface GreetingService{
		void sayMessage(String message);
	}
	

	public void demo1(){
		Java8Tester tester = new Java8Tester();
		//with type declaration
	      MathOperation addition = (int a, int b) -> a + b;
	      MathOperation subtraction=(int a, int b) -> a-b;
	      
	      //System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	      System.out.println("--addition--10+5  "+ tester.operate(10,5,addition));
	}
	
	
	 interface MathOperation {
	      int operation(int a, int b);
	   }
	 
	
	 
	 
}
