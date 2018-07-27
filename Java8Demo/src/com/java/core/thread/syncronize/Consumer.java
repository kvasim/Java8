package com.java.core.thread.syncronize;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	BlockingQueue<Integer> queue;
	int counter=0;
	public Consumer(BlockingQueue<Integer> queue) {
		this.queue=queue;
	}
	
	@Override
	public void run() {
		while(counter<=10) {
			try {
				System.out.println("Consumed "+this.queue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.counter++;
		}
	}
}
