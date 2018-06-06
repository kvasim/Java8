package com.demo.lambda;

public class App {
	
	public static void main(String[] args) {
		Runner runner= new Runner();
		runner.run(new Executable() {
			
			@Override
			public void execute() {
				System.out.println("This is overridden method");
			}
		});
		System.out.println("==================================");
		runner.run(()->System.out.println("This is lambda"));
		runner.run(()->System.out.println("This is integer number"));
	}
}
class Runner{
	public void run(final Executable e){
		System.out.println("this is executable block");
		e.execute();
	}
	
	public void run1(final Integer e){
		System.out.println("this is run Integer block");
		System.out.println(e.doubleValue());
	}
}
