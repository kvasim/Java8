package com.java.core.thread;

public class CleanHair {

	private String currentState = "";

	synchronized public void lather() {

		this.currentState = "Lather";
		System.out.println(this.currentState);
		notify();
		try {
			if (this.currentState.equals("Lather"))
				wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void rinse() {
		this.currentState = "Rinse";
		System.out.println(this.currentState);
		notify();
		try {
			if (this.currentState.equals("Rinse"))
				wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
