package com.java.core.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		System.out.println("Ajay".hashCode());
		System.out.println("Ajay".hashCode());
		System.out.println("Ajay1".hashCode());
		
		
		
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
		//	System.out.println(itr.next());
		}
	}

}
