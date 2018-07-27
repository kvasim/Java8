package com.java.core.collection.list;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main (String[] args)
    {
		treeSetDemo();
        TreeSet<String> ts1= new TreeSet<String>();
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");
 
        // Duplicates will not get insert
        ts1.add("C");
 
        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);  // [A,B,C]
 
        // ts1.add(2) ; will throw ClassCastException
        //             at run time
    }

	private static void treeSetDemo() {

		Set<String> tset= new TreeSet<>();
		tset.add("A");
		tset.add(null);
		
		System.out.println(" size-"+tset.size() +"  "+tset);
		
	}
}
