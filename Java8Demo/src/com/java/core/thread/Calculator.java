package com.java.core.thread;

public class Calculator implements Runnable {

	int total;
	
	public void run(){
		synchronized (this) {
			for(int i=0;i<100;i++){
				total+=i;
			}
			notifyAll();
		}
	}
}
