package com.java.core.collection.list;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String args[]) {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi1");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		System.out.println(" Hash Size-- "+set.size()+"    -- "+set);
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
