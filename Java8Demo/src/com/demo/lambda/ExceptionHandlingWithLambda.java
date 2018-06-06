/**
 * 
 */
package com.demo.lambda;

import java.util.function.BiConsumer;

/**
 * @author KVASIM
 *
 */
public class ExceptionHandlingWithLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] seqNumber = { 1, 2, 3, 4 };
		int key = 0;
		process(seqNumber, key,
				wrraperLambda((a, b) -> System.out.println(a / b)));
	}

	private static void process(int[] seqNumber, int key,
			BiConsumer<Integer, Integer> wrraperLambda) {
		for (int i : seqNumber) {
			wrraperLambda.accept(i, key);
		}

	}

	private static BiConsumer<Integer, Integer> wrraperLambda(
			BiConsumer<Integer, Integer> consumer) {
		return (a, b) -> {
			try{
			System.out.println(a / b);
			}catch (Exception e) {
				System.out.println(" Excetion while running");
			}
	};

}
}
