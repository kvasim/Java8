/**
 * 
 */
package com.demo.lambda;

/**
 * @author KVASIM
 *
 */
public class Greeter {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Greeter greeter= new Greeter();
		Greeting greeting= (i) ->System.out.println("Hello Good Morning-"+i);
		greeting.perform(10);
		Greeting anGreeting= new GoodAfterNoonGreeting();
		Greeting evGreeting= new GoodEveningGreeting();
		greeter.greet();
		greeter.greet(greeting);
		greeter.greet(anGreeting);
		greeter.greet(evGreeting);
	}

	public void greet(){
		System.out.println(" Hello world !!");
	}
	/*public void greet(Greeting greeting){
		greeting.perform();
	}*/
}
