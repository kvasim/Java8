package com.java.core.thread;

public class HairThread  extends Thread{
	String name;
	CleanHair cleanRef;
	
	public HairThread(String name,CleanHair cleanRef) {
		this.name=name;
		this.cleanRef=cleanRef;
		setName(this.name);
		start();
	}
	@Override
	public void run() {
		int counter=1;
		if(name.equals("Lather")) {
			while(true) {
				this.cleanRef.lather();
				try {
					this.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				counter++;
			}
		}
		int counter2=1;
		if(this.name.equals("Rinse")) {
			while(true) {
				this.cleanRef.rinse();
				counter++;
			}
		}
	}
}
