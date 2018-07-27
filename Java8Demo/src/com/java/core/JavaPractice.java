package com.java.core;

public class JavaPractice {

	public static void main(String[] args) {
		String obj= null;
		String str=" ole"+2+3+5;
	//	System.out.println(null);
		System.out.println(display(22));
		Employee emp=null;
	}
	
	private static int display(Object obj) {
		System.out.println(" dis object");
		return 0;
	}

	private static int display(String str) {
		try {
			System.out.println("This is display method");
			
		/*}catch (Exception e) {
			e.printStackTrace();*/
		}finally {
			System.out.println("---1------");
			//return 5;
		}
		//System.out.println("----------2");
		return 5;
	}

}
