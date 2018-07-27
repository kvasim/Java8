package com.java.core.inner;

public class TestOuterClass {
	private String outerValue="Helllo";
	int counter=10;
	class Inner{
		String mob="999999999";
		private int inValue=99;
		public void displayInner(){
			System.out.println("This is inner Method  ::"+outerValue);
		}
	}
	public static void main(String[] args) {
		TestOuterClass outer= new TestOuterClass();
		TestOuterClass.Inner inner= outer.new Inner();
		inner.displayInner();
	}
	public void outerDisplay(){
		System.out.println(" This is outer display...");
	}
}
