package com.java.core.thread;

public class Counter {
	 private int c = 0;
	 
	    synchronized public void increment() {
	        c++;
	    }
	 
	    synchronized  public void decrement() {
	        c--;
	    }
	 
	    public int value() {
	        return c;
	    }

}
