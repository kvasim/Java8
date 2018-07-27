package com.java.core.array;

import java.util.Stack;

public class ReplaceCurrentElementWithNextGrtInArr {

	public static void main(String[] args) {
		int arr[] = { 8, 1, 11, 3, 99, 7, 22, 6, 44 };

		// [11,11,99,99,-1,22,44,44,-1]
		// nextGreatest (arr);
		getNGE(arr);
		System.out.println("The modified array:");
		// printArray (arr);
	}

	public static void getNGE(int[] a) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(a[0]);
		for (int i = 1; i < a.length; i++) {
			if (s.peek() != null) {
				while (true) {
					if (s.isEmpty() || s.peek() > a[i]) {
						break;
					}
					if (!s.isEmpty())
						System.out.println(s.pop() + ":" + a[i]);
				}
			}
			s.push(a[i]);
		}
		while (!s.isEmpty() && s.peek() != null) {
			System.out.println(s.pop() + ":" + -1);
		}
	}

	private static void nextGreatest(int[] arr) {
		int size = arr.length;
		// Initialize the next greatest element
		int max_from_right = arr[size - 1];
		// The next greatest element for the rightmost
		// element is always -1
		arr[size - 1] = -1;
		// Replace all other elements with the next greatest
		for (int i = size - 2; i >= 0; i--) {
			// Store the current element (needed later for
			// updating the next greatest element)
			int temp = arr[i];
			// Replace current element with the next greatest
			arr[i] = max_from_right;
			// Update the greatest element, if needed
			if (max_from_right > temp)
				max_from_right = temp;
		}

	}

	/* A utility Function that prints an array */
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
