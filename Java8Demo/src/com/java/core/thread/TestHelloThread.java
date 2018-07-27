package com.java.core.thread;

public class TestHelloThread {

	public static void main(String[] args) {

		System.out.println(" This is main thread class, Name is= "+Thread.currentThread().getName());
		HelloThread thread= new HelloThread("FirstThread");
		System.out.println("New Thread has started");
		thread.start();
		
		System.out.println(" Main Thread Finished");
		//thread.display();
	}

}
