/**
 * 
 */
package com.demo.lambda;

/**
 * @author KVASIM
 *
 */
public class GoodAfterNoonGreeting implements Greeting {

	/* (non-Javadoc)
	 * @see com.demo.lambda.Greeting#perform()
	 */
	@Override
	public void perform() {
		System.out.println("Hello, Good Afternoon!!!");

	}

}
