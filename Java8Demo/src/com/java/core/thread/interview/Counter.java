package com.java.core.thread.interview;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	private AtomicInteger num=new AtomicInteger(0);
	private int intCounter=0;
	
	public void runCounter() {
		intCounter++;
		System.out.println(" Counter Value - "+intCounter);
	}
	
	 public void increment() {
		num.incrementAndGet();
	}
	
	public int getNum() {
		return num.get();
	}

}
