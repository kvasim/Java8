/**
 * 
 */
package com.demo.lambda;

/**
 * @author KVASIM
 *
 */
public class GreeterWithLambda {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		GreeterWithLambda greeter= new GreeterWithLambda();
		Greeting greeting=()-> System.out.println("Hello Lmbda, Good Morning");
		greeting.perform();
		greeting=()-> System.out.println("Hello Lmbda, Good After Noon");
		greeting.perform();
		greeting=()-> System.out.println("Hello Lmbda, Good Evening");
		greeting.perform();				
	}

	public void greet(){
		System.out.println(" Hello world !!");
	}
	public void greet(Greeting greeting){
		greeting.perform();
	}
}
