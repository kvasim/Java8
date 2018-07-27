package com.java8.functionalInterface;

public interface FInterface1 extends FInterface2{
	
	default void display() {
		System.out.println("This is the first interface default method");
	}

}
