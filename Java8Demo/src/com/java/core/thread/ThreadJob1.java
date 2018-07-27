package com.java.core.thread;

public class ThreadJob1 extends Thread {

	public ThreadJob1(String threadName) {
		super(threadName);

	}

	private  Counter counter ;

	@Override
	public void run() {
		System.out.println(this.getName() + " :: " + counter.value());
		for (int i = 0; i < 10; i++) {
			counter.increment();
			System.out.println(this.getName() + " :: " + counter.value());
			
			/*try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			/*counter.decrement();
			System.out.println(this.getName() + " :: " + counter.value());*/
		}
	}

	public Counter getCounter() {
		return counter;
	}

	public void setCounter(Counter counter) {
		this.counter = counter;
	}

}
