package com.java.core.thread;

public class WaitNotifyExample2 {
	public static void main(String[] args) {
		CleanHair clean= new CleanHair();
		new HairThread("Lather", clean);
		new HairThread("Rinse", clean);
	}

}
