package com.java.core.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<>();
		
		System.out.println(set.add("Hello"));
		System.out.println(set.add("Hello"));
		System.out.println(set.add("B"));
		System.out.println(set.add("B"));
		System.out.println(set.add("B"));
		System.out.println(set.add("Hello"));
		
		
		System.out.println(" Set "+set);
		

	}

}
