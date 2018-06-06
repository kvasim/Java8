/**
 * 
 */
package com.demo.lambda;

/**
 * @author KVASIM
 *
 */
public class TypeInferenceExample {
	public static void main(String[] args) {
		printLambda(s->s.length());
	}
	
	public static void printLambda(com.demo.lambda.TypeInference.StringLengthLambda lambda){
		System.out.println(lambda.getLength("Hello"));
	}
}

interface StringLengthLambda{
	int getlength(String s);
}