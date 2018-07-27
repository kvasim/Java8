package com.java.core.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.java.core.Employee;

public class HashMapExample {

	public static void main(String[] args) {
		
		//hashMapDemo1();
		//hashMapDemoWithEmp();
		
		storeEmployeeObjInMap();
	}

	private static void storeEmployeeObjInMap() {
		Map<Employee, String> map=new HashMap<>();
		map.put(getEmployeeObj(), "emp1Data");
		Employee employee=new Employee(1,"Wasim KHan","Ford");
		map.put(employee, "emp2Data");
		 employee=new Employee(1,"Wasim KHan","Ford");
		 map.put(employee, "emp3Data");
		 employee=new Employee(3,"Wasim KHan","Ford");
		 map.put(employee, "emp4Data");
		 
		 System.out.println(" size--"+map.size());
		 
		 System.out.println(map);
		
	}

	private static void hashMapDemoWithEmp() {
		Map<Employee, String> map=new HashMap<>();
		map.put(getEmployeeObj(), "Data1");
		Employee emp=getEmployeeObj();
		map.put(emp, "Data2");
		map.put(getEmployeeObj(), "Data3");
		System.out.println(" Size----"+map.size());
		display(map);
		System.out.println(map.get(emp));
		System.out.println(map.get(getEmployeeObj()));
		ConcurrentHashMap<String, String> cMap= new ConcurrentHashMap<>();
		cMap.put("33", "33");
		cMap.get("33");
	}

	private static void display(Map<Employee, String> map) {

		map.forEach((key,value)->System.out.println("Key  -"+key +"   Value  -"+value) );
	}

	private static Employee getEmployeeObj() {
		Employee employee=new Employee(1,"Wasim KHan","Ford");
		return employee;
		
	}

	private static void hashMapDemo1() {
		//HashMap declaration
		 Map<Integer,String> map=new HashMap<Integer,String>();
		 //Add data in map as Key/Value
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul"); 
		  System.out.println(" Size-> "+map.size());
		  System.out.println(" Data-> "+map);
		  System.out.println("--------------------------");
		  map.put(101,"Dummy");  
		  map.put(102,"RahulDummy"); 
		  map.put(104,"RahulDummy"); 
		  System.out.println(" Size next-> "+map.size());
		  System.out.println(" value-> "+map);
		  
		  System.out.println("Value-101-"+map.get(101));
		  System.out.println("Value --102- "+map.get(102));
		  //Iterate Map
		  /*for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  */
	}

}
