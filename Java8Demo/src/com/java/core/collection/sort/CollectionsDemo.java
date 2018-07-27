package com.java.core.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		/*List<String> listData= new ArrayList<String>();
		listData.add("Wasim");
		listData.add("Imran");
		listData.add("Rohan");
		*/
		List<Integer> listData= new ArrayList<Integer>();
		listData.add(5);
		listData.add(2);
		listData.add(1);
		listData.add(8);
		
		System.out.println(listData);
		Collections.sort(listData);
		
		Collections.reverse(listData);
		
		System.out.println(listData);

	}

}
