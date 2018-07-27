package com.java.core.interview.impl;

public class NextMaxNumberArray {
	
	public static void main(String[] args) {
		int[] input= {8,1,2,5,10,66,22,9,13,44};
		//  {10,2,5,10,66,-1,44,13,44,-1}
		int[] newArray = new int[10];
		for(int i=0;i<input.length;i++) {
			int num=input[i];
			int nextMaxNumber=-1;
			
			for(int j=i+1;j<input.length;j++) {
				if(input[j]>num && (input[j]<nextMaxNumber || nextMaxNumber==-1)) {
					nextMaxNumber=input[j];
				}
			}
			newArray[i]=nextMaxNumber;
		}
		for(int num:newArray) {
			System.out.print(num +" ");
		}
	}

}
	