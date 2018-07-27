package com.java.core;

public class AsciiDemo {

	public static void main(String[] args) {
		String str="598755465689";
		convertStringToInteger(str);
	}

	private static void convertStringToInteger(String str) {
		Long multiply=getMultiplyFactor(str.length());
		Long finalNumber=0L;
		for(int counter=0;counter<str.length();counter++) {
			char c= str.charAt(counter);
			finalNumber=finalNumber+( getInteger(c)*multiply);
			multiply=multiply/10;
		}
		System.out.println("Final Number  = "+finalNumber);
	}

	private static Long getMultiplyFactor(int length) {
		Long value=1L;
		for(int counter=1;counter<length;counter++) {
			value=value*10;
		}
		return value;
	}

	private static int getInteger(char c) {
		int number=0;
		int asciiNumber=(int)c;
		if(asciiNumber==48) {
			number=0;
		}else if(asciiNumber==49) {
			number=1;
		}else if(asciiNumber==50) {
			number=2;
		}else if(asciiNumber==51) {
			number=3;
		}else if(asciiNumber==52) {
			number=4;
		}else if(asciiNumber==53) {
			number=5;
		}else if(asciiNumber==54) {
			number=6;
		}else if(asciiNumber==55) {
			number=7;
		}else if(asciiNumber==56) {
			number=8;
		}else if(asciiNumber==57) {
			number=9;
		}
		return number;
	}

}
