package com.java.core;

import java.util.concurrent.ConcurrentHashMap;

public class MathDemo  {
	static String str;
	static {
		String st="ab";
		str="ABC";
	}

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> cmap= new ConcurrentHashMap<String, String>();
		cmap.put("a", "b");
		cmap.put("c", null);
		cmap.get("");
		
		System.out.println(cmap);
		
		/*Runtime.getRuntime().exit(9);
		Runtime.getRuntime().halt(status);
		int i=10;
		int j=20;
		//System.out.println("result"+ i-j);
		*/
		String str="77";
		System.out.println(MathDemo.str);
		MathDemo math= new MathDemo();
		//math.m1(null);
		int x=5;
		boolean b1=true;
		boolean b2=false;
		if((x==4)&& !b2)
		
		System.out.println("1");
		System.out.println("2");
		
		if((b2=true)&&b1)
		System.out.println("3");
		String s1="abc";
		String s2=new String("abc");
		System.out.println(s1==s2);
		s2.intern();
		System.out.println(s1==s2);
		int key=2;
		final long j=3;
		switch (key) {
		case 3:
			
			break;
		case 10:
			
			break;

		default:
			break;
		}
	}

	public void m1(int x[]) {

		System.out.println("M1");
	}


	public void m1(String str) {

		System.out.println("Str");
	}

	
}

interface I1{
	void m1();
}