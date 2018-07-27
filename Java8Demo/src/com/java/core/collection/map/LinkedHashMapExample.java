package com.java.core.collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>(); 
		Map<String, String> map= new LinkedHashMap<String,String>();
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  System.out.println(hm);
		  hm.put(100,"Wkhan"); 
		  System.out.println(hm);
		  
		/*for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
*/
		Set<String> set =map.keySet();
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			String key= itr.next();
			System.out.println(hm.get(key));
		}
		System.out.println("Finished");
	}

}
