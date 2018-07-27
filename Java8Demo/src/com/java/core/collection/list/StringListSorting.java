package com.java.core.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StringListSorting {

	public static void main(String args[]) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Viru");
		al.add("Saurav");
		al.add("Mukesh");
		al.add("Tahir");

		Collections.sort(al);
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
