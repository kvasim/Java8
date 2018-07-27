package com.java.core.thread.syncronize;

import java.util.concurrent.TimeUnit;

public class StopThreadDemo {

	private static  boolean stopRequested;
	public static void main(String[] args) throws InterruptedException {

		Thread bgT= new Thread(()-> {
			int i=0;
			while(!stopRequested) {///Never finished
				i++;
			}
		});
		bgT.start();
		TimeUnit.SECONDS.sleep(1);
		stopRequested=true;
		System.out.println(" Main Method finished");
	
	}

}
