package com.java.core.fibonacci;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Stream;

public class FibonacciExample {

	public static void main(String[] args) {

		//printFibonacciSeries();
	//	fibonacciDemo(10);
		System.out.println();

		// Java 8 Approach
		//System.out.println(generate(10)); // Test the code.

		// Recursion

		for (int i = 0; i < 10; i++) {
			System.out.print(fibonacci(i) + " ");
		}

	}

	private static void printFibonacciSeries() {

		int febCount = 10;
		int[] feb = new int[febCount];
		feb[0] = 0;
		feb[1] = 1;
		for (int i = 2; i < febCount; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
		}

		for (int i = 0; i < febCount; i++) {
			System.out.print(feb[i] + " ");
		}
		System.out.println();
	}

	private static void fibonacciDemo(final int fibLimit) {
		int[] feb = new int[fibLimit];
		feb[0] = 0;
		feb[1] = 1;
		for (int counter = 2; counter < fibLimit; counter++) {
			feb[counter] = feb[counter - 1] + feb[counter - 2];
		}
		for (int num : feb) {
			System.out.print(num + " ");
		}
	}

	// JAVA 8 APPROACH

	private static List<Integer> generate(final int fibLimit) {

		// Stream.iterate(new int[] {0, 1},s->new int[]
		// {s[0],s[0]+s[1]}).limit(fibLimit).map(n->n[0]).collect(toList());

		return Stream.iterate(new int[] { 0, 1 }, s -> new int[] { s[1], s[0] + s[1] }).limit(fibLimit).map(n -> n[0])
				.collect(toList());

	}

	/*
	 * * Java program for Fibonacci number using recursion. * This program uses tail
	 * recursion to calculate Fibonacci number for a given number * @return
	 * Fibonacci number
	 */
	public static int fibonacci(int number) {
		if(number==0) {
			return 0;
		}
		if (number == 1 || number == 2) {
			return 1;
		}
		int sum= fibonacci(number - 1) + fibonacci(number - 2); // tail recursion }
		return sum;
		
	}

}
