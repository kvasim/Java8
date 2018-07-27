package com.java.core.thread;

public class OddThreadImplementation implements Runnable {
	EvenOdd evenOdd;
	public OddThreadImplementation(EvenOdd evenOdd) {
		this.evenOdd=evenOdd;
	}
	
	
	@Override
	public void run() {
		try {
			this.evenOdd.printOdd();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
