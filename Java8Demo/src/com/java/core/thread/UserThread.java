package com.java.core.thread;

public class UserThread implements Runnable {
	private volatile int counter = 0;

	@Override
	public void run() {
		/*
		 * for(int i=0;i<3;i++) {
		 * System.out.println(Thread.currentThread().getName()+"   Counter  --"+i); }
		 */
		while (true) {
			System.out.println(Thread.currentThread().getName()+"  Counter  " + ++counter);
			try {
				Thread.sleep(100);
				
				if(counter>=20)break;
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
