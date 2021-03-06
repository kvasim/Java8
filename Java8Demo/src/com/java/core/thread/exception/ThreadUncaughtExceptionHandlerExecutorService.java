package com.java.core.thread.exception;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class ThreadUncaughtExceptionHandlerExecutorService {

	public static void main(String[] args) throws InterruptedException {
		CaughtExceptionsThreadFactory threadFactory = new CaughtExceptionsThreadFactory();
        ExecutorService executor = Executors.newCachedThreadPool(threadFactory);
 
        System.out.println("Executing tasks:");
        for (int i = 0; i < 5; ++i) {
            executor.execute(new ExceptionalTask());
        }
        System.out.println("Shutting down the executor.");
        // we'll wait for two seconds, just to have clean output
        executor.awaitTermination(2, TimeUnit.SECONDS);
 
        printResults(threadFactory.handler);
        System.out.println(" The End ----------");
    }
 
    private static void printResults(UncaughtExceptionHandler handler) {
        System.out.println("\nCaught errors:");
        System.out.println(handler.toString());
    }

	
	public static class ExceptionalTask implements Runnable {
        private static int ntasks = 0;
        private int taskId = ++ntasks;
 
        @Override
        public void run() {
            System.out.println("Starting work in thread: " + taskId);
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                //ignore
            }
            if ((taskId % 2) == 0) {
                throw new RuntimeException("An Exception that ends task: " + taskId);
            } else {
                System.out.printf("Task %d finished normally.%n", taskId);
            }
        }
    }
	private static class CaughtExceptionsThreadFactory implements ThreadFactory {
        private UncaughtExceptionHandler handler= new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread thread, Throwable throwable) {
				System.out.println(" This is exception handler**********");
				System.out.println(thread.getName() +"  "+throwable.getMessage());
				
			}
		};
 
        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            t.setUncaughtExceptionHandler(handler);
            return t;
        }
    }
}
