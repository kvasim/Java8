package com.java.core;

import java.util.concurrent.ConcurrentHashMap;

public class GeneralJavaDemo {

	private final Integer intValue;
	private Integer ip;
	public GeneralJavaDemo() {
		this.intValue=10;
	}
	
	void checkValue() {
		int i=ip;
		System.out.println("iii "+i);
	}
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> cmap= new ConcurrentHashMap<>();
		cmap.put("", "");

		GeneralJavaDemo dd= new GeneralJavaDemo();
		dd.checkValue();
	//	findOSType();
		//generalTest();
		
		Object obj;
	}

	private static void generalTest() {

		 System.out.println(Math.max(4, 5));
	}

	public static void findOSType() {
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("sun.arch.data.model"));
		System.out.println(Runtime.class.getPackage().getImplementationVersion());
		Runtime.getRuntime().getRuntime();
	}

}
