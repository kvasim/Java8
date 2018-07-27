package com.java.core.thread;

public class SequencialCounterThread3 implements Runnable {
	transient Integer threadCounter;
	private Object mutex;

	public SequencialCounterThread3(Integer threadCounter, Object mutex) {
		this.threadCounter = threadCounter;
		this.mutex=mutex;
	}

	@Override
	public void run() {
		while (true) {
			if (this.threadCounter >= 15) {
				this.mutex.notifyAll();
				break;
			} else {
				this.mutex.notify();
				this.threadCounter++;
				System.out.println(Thread.currentThread().getName() + " = " + this.threadCounter);
				try {
					this.mutex.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
