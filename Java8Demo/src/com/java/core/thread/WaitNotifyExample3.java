package com.java.core.thread;

public class WaitNotifyExample3 {
	public static void main(String[] args) throws InterruptedException {
		Runnable r1=new UserThread();
		Thread t1= new Thread(r1,"FirstThread1");
		Thread t2= new Thread(r1,"FirstThread2");
		Thread t3= new Thread(r1,"FirstThread3");
		t1.start();t1.join();
		t2.start();t2.join();
		t3.start();t3.join();
		System.out.println(" Main End ");
		
	}
	
}
