package com.java.core.thread;

public class NewThreadDemo extends Thread {
	
	public NewThreadDemo(String threadName) {
		super(threadName);
		
	}

	@Override
	public void run(){
		
		System.out.println(" New thread--"+ this.getName());
		for(int counter=0; counter<5;counter++) {
			System.out.println(this.getName()+" --  "+counter);
		}
		throw new RuntimeException(" This is intentionaly thown");
		
	}
	
	public void display(){
		System.out.println(" This is display method from NewThreadDemo class");
	}

}
