package com.java.core.thread.syncronize;

import java.util.concurrent.TimeUnit;

public class StopThreadDemoV2 {

	private static boolean stopRequested;
	private static synchronized void requestStop() {
		stopRequested=true;
	}
	private static synchronized boolean stopRequested() {
		return stopRequested;
	}
	public static void main(String[] args) throws InterruptedException {

		Thread bgT= new Thread(()-> {
			int i=0;
			while(!stopRequested()) {
				i++;
			}
		});
		bgT.start();
		TimeUnit.SECONDS.sleep(1);
		stopRequested=true;
		System.out.println(" Main Method finished");
		requestStop();
	}

}
