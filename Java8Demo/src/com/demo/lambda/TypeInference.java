/**
 * 
 */
package com.demo.lambda;

/**
 * @author KVASIM
 *
 */
public class TypeInference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StringLengthLambda lengthLambda= s->s.length();
		//System.out.println(lengthLambda.getLength("Wasim Khan"));
		printLambda(s->s.length());
	}

	public static void printLambda(StringLengthLambda l){
		System.out.println(l.getLength("Alfaiz Khan"));
	}
	interface StringLengthLambda{
		int getLength(String s);
	}
}
