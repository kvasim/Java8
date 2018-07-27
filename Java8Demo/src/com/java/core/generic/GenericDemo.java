package com.java.core.generic;

import java.util.HashSet;
import java.util.Set;

import com.java.core.GeneralJavaDemo;

public class GenericDemo {
	static {
		System.out.println(" This is static block  method ");
		GeneralJavaDemo gj= new GeneralJavaDemo();
		gj.findOSType();

	}

	public static void main(String[] args) {

		Set<? extends Number> set= new HashSet<Float>();
		System.out.println(" This is main method ");
		GeneralJavaDemo gj= new GeneralJavaDemo();
		//gj.findOSType();
	}

}
