/**
 * 
 */
package com.java.core.thread;

/**
 * @author KVASIM
 *
 */
public class HelloRunnable implements Runnable{
	
	public HelloRunnable(){
		Thread thread=new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		 System.out.println("Hello from a Hello Runnable run method ! Thread Name is = "+Thread.currentThread().getName());
	        for(int i=1;i<=5;i++){
	        	try {
					Thread.sleep(1000);
					System.out.println(" Counter value is = "+i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	        }
	        System.out.println(" Run method finished in thread -"+Thread.currentThread().getName());
	}

	public void display() {

		System.out.println(" This is HelloRunnable Display method . Thread name="+Thread.currentThread().getName());
	}

}
