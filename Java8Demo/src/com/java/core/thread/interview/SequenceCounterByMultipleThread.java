package com.java.core.thread.interview;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceCounterByMultipleThread implements Runnable {

	private AtomicInteger sharedCounter;
	private final int threadPosition;

	public SequenceCounterByMultipleThread(AtomicInteger sharedCounter, int tPosition) {
		this.threadPosition = tPosition;
		this.sharedCounter = sharedCounter;
	}

	@Override
	public void run() {

		while (this.sharedCounter.get() < 9) {
			synchronized (this.sharedCounter) {
				if (this.sharedCounter.get() % 3 == this.threadPosition) {
					int value = this.sharedCounter.get() + 1;
					System.out.println(Thread.currentThread().getName() + "  " + value);
					if (this.sharedCounter.get() < 9) {
						this.sharedCounter.incrementAndGet();
					}
				}
			}
		}
	}

}
