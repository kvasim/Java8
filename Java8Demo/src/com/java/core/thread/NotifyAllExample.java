package com.java.core.thread;

public class NotifyAllExample {
	
	public static void main(String[] args) {
		Calculator calculator= new Calculator();
		new Reader(calculator).start();
		new Reader(calculator).start();
		new Reader(calculator).start();
		new Thread(calculator).start();
		
	}

}
