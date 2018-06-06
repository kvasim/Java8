/**
 * 
 */
package com.demo.lambda;

/**
 * @author KVASIM
 *
 */
public class GoodEveningGreeting implements Greeting {

	/* (non-Javadoc)
	 * @see com.demo.lambda.Greeting#perform()
	 */
	@Override
	public void perform() {
		System.out.println("Hello, Good Evening!!!");
	}

}
