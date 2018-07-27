package com.java.core.inner;

public class TestStaticInner {

	static int data = 30;

	static class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}
	public static void main(String args[]) {
		TestStaticInner.Inner obj = new TestStaticInner.Inner();
		obj.msg();
	}
}
