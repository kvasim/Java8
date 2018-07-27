package com.java.core.collection.list;

import com.java.core.Company;

public class UserClass {
	int num=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserClass class1= new UserClass();
		UserClass class2= new UserClass();
		
		Company com= new Company();
		class1=class2;
		//class1=com;
		

	}

	private void display() {
		System.out.println(" Display "+num);		
	}

}
