package com.java.core.oops.interview;

public class OopsDemo1 {
	
	static String str="-";
	
	public static void main(String[] args) {
		BMW bmw= new BMW();
		Car car= new BMW();
		
		//BMW bm= (BMW) new Car(); Run time exception--java.lang.ClassCastException:
		bmw.display();
		car.display();
		System.out.println(" Done ");
		
	}

}
