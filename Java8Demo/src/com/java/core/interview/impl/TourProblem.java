package com.java.core.interview.impl;

import java.util.Arrays;
import java.util.Scanner;

public class TourProblem {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int ctoken, cchoice, tokens[], choices[];

		ctoken = in.nextInt();
		cchoice = in.nextInt();
		tokens = new int[ctoken];
		choices = new int[cchoice];

		// System.out.println("CToken : "+ctoken);
		// System.out.println("CChoices : "+cchoice);

		for (int i = 0; i < ctoken; i++) {
			tokens[i] = in.nextInt();
		}

		for (int j = 0; j < cchoice; j++) {
			choices[j] = in.nextInt();
		}

		System.out.println("Tokens : " + Arrays.toString(tokens));
		System.out.println("Choices : " + Arrays.toString(choices));

		//System.out.println("Possible Choices : " + Arrays.toString(possibleChoicesFromTokes(tokens, choices)));
		for (boolean b : possibleChoicesFromTokes(tokens, choices)) {
			if (b == true) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		
		in.close();
	}

	static boolean[] possibleChoicesFromTokes(int tokens[], int choices[]) {
		boolean possibleChoices[] = new boolean[choices.length];
		for (int t = 0; t < tokens.length; t++) {
			//System.out.println("Token [t] : "+tokens[t]);
			for (int c = 0; c < choices.length; c++) {
				//System.out.println("Choices [c] : "+choices[c]);
				if (choices[c] % tokens[t]== 0) {
					//System.out.println("choices[c] % tokens[t] = "+choices[c] % tokens[t]);
					possibleChoices[c] = true;
				}
			}
		}
		return possibleChoices;
	}

}
