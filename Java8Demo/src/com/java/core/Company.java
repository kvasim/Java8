package com.java.core;

public class Company implements InterfaceDemo{
	private String compnayName="Ford";
	public Company(String name)
	{
		compnayName="khan";
	}
	public Company()
	{
	}

	public void display(){
		System.out.println(" This is Company class  "+compnayName);
	}
	
	public void showDetails(String name){
		System.out.println(" Emp Name in Company  "+name);
	}

	@Override
	public int getSalary() {
		return 0;
	}

	@Override
	public void methodDemo() {
		// TODO Auto-generated method stub
		
	}
}
