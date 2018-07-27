package com.java.core.thread;

public class EvenOdd{

	public EvenOdd() {
		
	}
	public synchronized void printOdd() throws InterruptedException {
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				this.wait();
			}else{
				this.notify();
				System.out.println(" Odd -"+i);
			}
		}
	}
	
	public synchronized void printEven() throws InterruptedException {
		for(int i=2;i<10;i++) {
			if(i%2==0) {
				this.notify();
				System.out.println(" Even -"+i);
			}else{
				this.wait();
			}
		}
	}
	
}
