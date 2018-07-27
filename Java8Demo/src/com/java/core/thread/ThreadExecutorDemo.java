package com.java.core.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadExecutorDemo {
	 private static final int NTHREDS = 10;

	    public static void main(String[] args) throws InterruptedException {
	        ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
	        for (int i = 0; i < 500; i++) {
	            Runnable worker = new MyRunnable(i);
	            System.out.println("Running Thread No is ->"+i);
	            executor.execute(worker);
	        }
	        // This will make the executor accept no new threads
	        // and finish all existing threads in the queue
	        executor.shutdown();
	        // Wait until all threads are finish
	        executor.awaitTermination(0, TimeUnit.NANOSECONDS);
	        System.out.println("Finished all threads");
	    }
}
