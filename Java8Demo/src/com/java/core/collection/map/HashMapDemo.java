package com.java.core.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, String> map= new HashMap<String,String>();
		
		map.put("Wasim", "Wasim");
		map.put("LName", "Khan");
		System.out.println(map.get("Wasim"));
		
		Map.Entry<String, String> entry=(Entry<String, String>) map.entrySet();
		
		Map<Integer, String> map1= new HashMap<Integer,String>();
		
		map1.put(11, "Wasim");
		map1.put(22, "Khan");
		
		System.out.println(map1.get(11));
		
Map mapObj= new HashMap();
		
		mapObj.put(11, "Wasim");
		mapObj.put(22, "Khan");
		
		System.out.println(map1.get(11));

	}

}
