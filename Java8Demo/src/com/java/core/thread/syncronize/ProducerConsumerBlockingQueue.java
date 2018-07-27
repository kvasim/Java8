package com.java.core.thread.syncronize;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueue {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue= new LinkedBlockingQueue<>(1);
		Producer producer= new Producer(queue);
		Consumer consumer= new Consumer(queue);
		Thread prodT=new Thread(producer, "Producer");
		Thread consT= new Thread(consumer, "Consumer");
		prodT.start();
		consT.start();
	}

}
