package com.java.core.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCounter {
	
	public static void main(String[] args) throws InterruptedException {
		Counter counter= new Counter();
		ThreadJob1 job1= new ThreadJob1("FirstThread");
		job1.start();
		job1.setCounter(counter);
		ThreadJob2 job2=new ThreadJob2("SecondThread");
		job2.start();
		job2.setCounter(counter);
		
		int nThreads=10;
		/*ExecutorService executorService= Executors.newFixedThreadPool(nThreads);
		executorService.execute(job1);
		executorService.execute(job2);*/
	}

}
