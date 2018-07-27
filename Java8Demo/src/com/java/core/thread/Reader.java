package com.java.core.thread;

public class Reader extends Thread {

	private Calculator calculator;

	public Reader(Calculator calculator) {
		this.calculator=calculator;
	}
	
	@Override
	public void run() {
		synchronized (calculator) {
			try{
				System.out.println(" Waiting for calculation...........");
				calculator.wait();
			}catch(InterruptedException exp){
				exp.printStackTrace();
			}
			System.out.println(" Total is :: "+calculator.total);
		}
	}
	

}
