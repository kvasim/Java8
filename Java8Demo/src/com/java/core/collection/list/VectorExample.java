package com.java.core.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		// create default vector
        Vector v = new Vector();
        
         
        v.add(1);
        v.add(2);
        v.add("geeks");
        v.add("forGeeks");
        v.add(3);
        
        System.out.println("Vector is " + v);
        //Iterator to Vector
        Iterator itr= v.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
	}

}
