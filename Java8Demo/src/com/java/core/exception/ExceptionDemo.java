package com.java.core.exception;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		System.out.println(validateMultipleReturnStatement());
	}
	
	//@SuppressWarnings("finally")
	private static int validateMultipleReturnStatement() {
		ExceptionDemo exp=null;
		try {
		System.out.println(" This is method start");
		exp.getClass();
		return 1;
		}catch (NullPointerException e) {
			System.out.println(" This is nullpointer exception block");
			return 11;
		}catch (Exception e) {
			System.out.println(" This is exception block");
			e.printStackTrace();
			return 2;
		}finally {
			System.out.println(" This is finally block");
			return 3;
		}
	}


}
