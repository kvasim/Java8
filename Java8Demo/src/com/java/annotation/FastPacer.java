package com.java.annotation;

class BowlerClass {
	void bowlingMethod() {
		System.out.println(" bowler ");
	}
}

public class FastPacer extends BowlerClass {
	void bowlingMethod() {
		System.out.println(" fast bowler ");
	}

	public static void main(String[] args) {
		FastPacer obj = new FastPacer();
		obj.bowlingMethod();
	}
}