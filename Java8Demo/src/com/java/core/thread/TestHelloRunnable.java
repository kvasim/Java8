package com.java.core.thread;

public class TestHelloRunnable {

	public static void main(String[] args) {
		
		
System.out.println(" Main Thread started  "+Thread.currentThread().getName());
		HelloRunnable helloRunnable= new HelloRunnable();
		//helloRunnable.display();
		System.out.println(" The Main Thread Finished ="+Thread.currentThread().getName());
	}

}
