package com.demo.lambda;

import com.demo.Java8Example2;

public class RunnableExample {

	public static void main(String[] args) {

		Thread thread= new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(" Hello, this is thread runnable method ");
				
			}
		});
		thread.run();
		//Thread lmdaThread=new Thread(()-> System.out.println("Hello, this is lambda runnable method "));
		Thread lmdaThread2= new Thread(()->new Java8Example2().demo1());
		lmdaThread2.run();
	}
}
