package com.java.core.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
		System.out.println(MAX_ARRAY_SIZE);
		
		List list= new ArrayList();
		ArrayList<String> arList= new ArrayList<String>();
		list.add(1);
		list.add('A');
		list.add("Wasim");
		list.add("Wasim");
		list.add(5.5);
		
		//Define list for String data type
		List<String> listStr= new ArrayList<String>();//
		List<Integer> list1= new ArrayList<Integer>();//
		String str= new String("Aaa");
		Integer in= new Integer(10);
		
		System.out.println(list);
		list.remove("Wasim");
		System.out.println(list);
		//Access data as per index 
		for(int i=0;i<list.size();i++){
			Object obj=list.get(i);
			System.out.println(obj);
		}
		//one element by index
		//System.out.println(list.get(2));
		
		
		// Iterator java collection
		System.out.println("  by Iterator ***************");
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		/// Enhance Loop
		
		for(Object obj:list){
			System.out.println(obj);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
