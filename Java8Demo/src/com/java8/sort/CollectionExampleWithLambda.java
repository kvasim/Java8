package com.java8.sort;

import java.util.HashMap;
import java.util.Map;

public class CollectionExampleWithLambda {

	public static void main(String[] args) {

		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		/// By Lambda:
		
		items.forEach((k,v)->{
			
		System.out.println("Key-"+k +" Count-"+v);
		if(k.equals("E")) {
			System.out.println(" Hi E");
		}
		
		});
	
	}
}
