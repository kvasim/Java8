package com.java.core.array;

public class SeconLargetNumberInArray {

	public int findSecondLargetNumberFromArray(int[] numArray){
		int secondLNum = 0,largestNum=0;
		for(int num:numArray) {
			if(num>largestNum) {
				secondLNum=largestNum;
				largestNum=num;
			}else if(num>secondLNum) {
				secondLNum=num;
			}
		}
		return secondLNum;
	}

}
