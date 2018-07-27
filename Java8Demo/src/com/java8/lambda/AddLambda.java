package com.java8.lambda;

import java.util.function.BinaryOperator;

public class AddLambda {
	
	
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		BinaryOperator<Integer> sumAction=(i,j)->i+j;
		int sum=sum(a,b,sumAction);
		System.out.println(" Sum =:"+sumAction.apply(a, b));
		
		Sayble say= (input)->" hellow this is input  "+input;
		System.out.println(say.say("This is best time to "));
		
	}

	private static int sum(int a, int b, BinaryOperator<Integer> sumAction) {
		
		return sumAction.apply(a, b);
	}

	private static int sum(int a, int b) {
		return a+b;
	}
	
	interface Sayble{
		String say(String str);
	}
	
}
