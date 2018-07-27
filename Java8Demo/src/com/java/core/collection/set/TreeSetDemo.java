package com.java.core.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set set = new TreeSet();
		set.add("3");
		set.add("1");
		set.add("0");
		set.add("6");
		set.add("b");
		set.add("a");
		System.out.println(set);
		
		//
		Set set1 = new TreeSet();
		set1.add(2);
		set1.add("1");
		set1.add(1.4);
		set1.add("a");
		System.out.println(set1);
		
	}

}
