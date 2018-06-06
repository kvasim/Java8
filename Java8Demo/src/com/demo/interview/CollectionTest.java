/**
 * 
 */
package com.demo.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author KVASIM
 *
 */
public class CollectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		addListInList();
				
	}
	
	
	public static void addListInList(){
		List<Employee> list= new ArrayList<Employee>();
		list.add(new Employee(1, "Salman"));
		list.add(new Employee(2, "Salman2"));
		list.add(new Employee(3, "Salman3"));
		
		List<Employee> list2= new ArrayList<Employee>();
		list2.add(new Employee(22, "Salman22"));
		list2.add(new Employee(33, "Salman33"));
		
		list.addAll(list2);
		
		System.out.println("  list size  "+list.size());
		for(Employee emp:list){
			System.out.println(" id :"+emp.getId());
		}
		list2.addAll(list);
		System.out.println("  list size  "+list2.size());
		for(Employee emp:list2){
			System.out.println(" id :"+emp.getId());
		}
		
	}
	

}
