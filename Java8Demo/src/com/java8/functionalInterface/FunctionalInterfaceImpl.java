package com.java8.functionalInterface;

public class FunctionalInterfaceImpl implements FInterface1,FInterface2 {


	public void Hello() {
		System.out.println(" This is Impl class ");
		FInterface1.super.display();
	}

	@Override
	public void display() {
		FInterface1.super.display();
	}
}
