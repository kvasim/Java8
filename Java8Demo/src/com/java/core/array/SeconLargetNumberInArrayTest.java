package com.java.core.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SeconLargetNumberInArrayTest {

	private SeconLargetNumberInArray array= new SeconLargetNumberInArray();
	@Test
	void testSecondLargestNumberFromArray() {
		int[] numArray= {22,2,1,12,66,30,2};
		
		int secondLNum=this.array.findSecondLargetNumberFromArray(numArray);
		assertEquals(30, secondLNum);

	}
	@Test
	void testSecondLargestImplementation() {
		int[] numArray= {22,21,20,15,12,6,133,42,41};
		int seconL=this.array.findSecondLargetNumberFromArray(numArray);
		System.out.println(" Second L Value= "+seconL);
	}

}
