package com.java.core.thread;

public class HelloThread extends Thread {
	
	 public HelloThread(String newThreadName) {
		 super(newThreadName);
	}

	public void run() {
	        System.out.println("Hello from a thread run method ! Thread Name is = "+getName());
	        for(int i=1;i<=5;i++){
	        	System.out.println(" Counter value is = "+i);
	        }
	    }
	 
	 public void display(){
		 System.out.println(" This is display method from HelloThread class ");
	 }

}
