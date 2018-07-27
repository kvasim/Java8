package com.java.core.thread.syncronize;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	BlockingQueue<Integer> queue;
	Random random;
	int counter=0;
	public Producer(BlockingQueue<Integer> queue) {
		this.queue=queue;
		this.random=new Random();
	}
	
	@Override
	public void run() {
		while(counter<=10) {
			try {
				this.queue.put(this.counter);
				System.out.println("Produced "+this.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.counter++;
		}
	}
}
