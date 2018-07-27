package com.java.core.oops.interview;

public class EmployeeDemo implements InterfaceA{


	public static void main(String[] args) {
		EmployeeDemo ed= new EmployeeDemo();
		
		InterfaceA a= new EmployeeDemo();
		InterfaceA b= new EmployeeDemo();
		
		ed.display();
		
		a.display();
		b.display();
	}

	@Override
	public void display() {
		System.out.println("  ------- ");
	}
}
