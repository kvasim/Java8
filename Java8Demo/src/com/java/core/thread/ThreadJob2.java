package com.java.core.thread;

public class ThreadJob2 extends Thread {

	public ThreadJob2(String threadName) {
		super(threadName);

	}

	private Counter counter ;

	@Override
	public void run() {

		System.out.println(this.getName() + " :: " + counter.value());
		for (int i = 0; i < 10; i++) {
			/*counter.decrement();
			System.out.println(this.getName() + " :: " + counter.value());*/
			counter.increment();
			System.out.println(this.getName() + " :: " + counter.value());
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public Counter getCounter() {
		return counter;
	}

	public void setCounter(Counter counter) {
		this.counter = counter;
	}

}
