package com.java.core.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommanElementDemo {

	public static void main(String[] args) {
		
		//Find out comman element from array
		Integer[] arr1= {11,2,4,7,3,7,2,0};
		Integer[] arr2= {1,4,7,66,5,2,0,11};
		List<Integer> list1= Arrays.asList(arr1);
		List<Integer> list2= Arrays.asList(arr2);
		System.out.println(list1);
		System.out.println(list2);
		List<Integer> l3 = new ArrayList<Integer>(list2);
	//	l3.retainAll(list1);
		l3.removeAll(list1);
		
		System.out.println(l3);

	}
}
