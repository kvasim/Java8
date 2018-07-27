package com.java.core.thread;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class JavaThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		
		System.out.println(" This is main thread --"+Thread.currentThread().getName());
		//System.out.println(" Main thread Priority  -"+Thread.currentThread().getPriority());
		//First New Thread
		NewThreadDemo newThreadDemo= new NewThreadDemo("ThreadOne");
		newThreadDemo.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread thread, Throwable throwable) {
				System.out.println(" Exception Occured ");
				System.out.println(thread.getName()+"       "+throwable.getMessage());
				
			}
		});
		NewThreadDemo newThreadDemo2= new NewThreadDemo("ThreadOne2");
		//newThreadDemo.setPriority(5);
		newThreadDemo.setDaemon(true);
		System.out.println(" Damon Thread ---"+newThreadDemo.isDaemon());
		newThreadDemo.start();
		//Second thread
		//newThreadDemo.join();
		
		//newThreadDemo2.setPriority(10);
		newThreadDemo2.start();
			//newThreadDemo2.join();
			//newThreadDemo.join();
			
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//need to intract with use
		//newThreadDemo.display();
		
		System.out.println(" Main thread finished");
		//WeakReference<StringBuilder> ref= new WeakReference<StringBuilder>(new StringBuilder());
		SoftReference<StringBuilder> softRef;
	}

}
