package com.java.core.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class SequencialCounterThread1 implements Runnable {
	 AtomicInteger sharedCounter;
	 private final int threadPosition;

	public SequencialCounterThread1(AtomicInteger threadCounter, int position) {
		this.sharedCounter = threadCounter;
		this.threadPosition=position;
	}

	@Override
	public void run() {

		while (this.sharedCounter.get()<=10) {
			if (this.sharedCounter.get()%3== this.threadPosition) {
				int value= this.sharedCounter.get()+1;
				System.out.println(Thread.currentThread().getName()+" "+value);
				this.sharedCounter.incrementAndGet();
			}
		}
	}

}
