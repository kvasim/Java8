package com.java.core.thread;

public class EvenThreadImplementation implements Runnable {
	EvenOdd evenOdd;
	public EvenThreadImplementation(EvenOdd evenOdd) {
		this.evenOdd=evenOdd;
	}
	
	
	@Override
	public void run() {
		try {
			this.evenOdd.printEven();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
