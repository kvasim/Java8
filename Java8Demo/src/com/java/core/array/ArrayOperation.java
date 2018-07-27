package com.java.core.array;

import java.util.Arrays;

public class ArrayOperation {
	public static void main(String[] args) {
		int[] arr = { 15, 2, 3, 4, 5 };
		int sum = sumArray(arr);
		System.out.println(" Sum "+ sum);
		

	}

	private static int sumArray(int[] arr) {
		return Arrays.stream(arr).sum();
	}
}
