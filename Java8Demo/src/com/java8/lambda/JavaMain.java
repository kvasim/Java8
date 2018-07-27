package com.java8.lambda;

public class JavaMain {
	
	public static void main(String[] args) {
		
		Greeting hwGreet= new HelloWorldGreeting();
		Greeter greeter= new Greeter();
		greeter.greet(hwGreet);
	}

}
