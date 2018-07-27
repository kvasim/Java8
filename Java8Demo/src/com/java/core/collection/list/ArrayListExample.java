package com.java.core.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.java.core.Employee;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayListExample arrayListExample = new ArrayListExample();
		// Create ArrayList Object
		List list = arrayListExample.PrepareArrayListObject();
		// Print ArrayList::
		arrayListExample.printArrayList(list);
		
		//Store User defined Object
		arrayListExample.addEmpObjInList();
	}

	private void addEmpObjInList() {
		List empList= new ArrayList();
		Employee emp= new Employee(1, "Wasim", "Ford");
		empList.add(emp);
		emp= new Employee(2, "Imran", "IBM");
		empList.add(emp);
		emp= new Employee(3, "Tahir", "Honda");
		empList.add(emp);
		
		//print obj from list:
		System.out.println("\n======Employee details==============");
		Iterator itr= empList.iterator();
		while(itr.hasNext()){
			Employee empObj=(Employee) itr.next();
			System.out.println(" Id :="+empObj.getEmpNum()+" Name=: "+empObj.getEmpName());
		}
		
		
		
	}

	private void printArrayList(List list) {
		// First Way
		System.out.println("====================");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println("\n====================");
		// Second Way
		for (Object obj : list) {
			System.out.print(obj + ", ");
		}
		// Third way
		System.out.println("\n====================");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}

	}

	private List PrepareArrayListObject() {

		List list = new ArrayList();
		list.add("Wasim");
		list.add(1);
		list.add(2.5);
		list.add(true);
		return list;
	}

}
