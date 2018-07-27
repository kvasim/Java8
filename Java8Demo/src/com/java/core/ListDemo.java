package com.java.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("d");
		list.add("c");
		list.add("a");
		list.add("e");
		list.add("c");
		System.out.println(list);
		Collections.reverse(list);
		List<String> temp= new ArrayList<>();
		Iterator<String> itr= list.iterator();
		while(itr.hasNext()) {
			String value=itr.next();
			temp.add(value);
			if(value=="a") {
				break;
			}
			
		}
		System.out.println(temp);
		Collections.reverse(temp);
		System.out.println(temp);
		
		
		
		

	}

}
