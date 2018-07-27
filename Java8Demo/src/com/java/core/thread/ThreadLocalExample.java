package com.java.core.thread;

public class ThreadLocalExample {

	public static void main(String[] args) {

		ThreadLocal<Integer> tl= new ThreadLocal<>();
		tl.set(11);
		System.out.println(tl.get());
	}

}
