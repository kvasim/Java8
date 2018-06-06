/**
 * 
 */
package com.java.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author KVASIM
 *
 */
public class CollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<ToDos, String> m= new HashMap<ToDos, String>();
		ToDos t1= new ToDos("Monday");
		ToDos t2= new ToDos("Monday");
		ToDos t3= new ToDos("Tuesday");
		ToDos t4= new ToDos("Monday");
		m.put(t1,"doLaundry");
		m.put(t2, "PayBills");
		m.put(t3,"CleanAttic");
		m.put(t4,"Enjoy");
		System.out.println(" Size :"+m.size());
		 t1= new ToDos("Monday");
		System.out.println("get value: "+m.get(t1));
		 t2= new ToDos("Monday");
		System.out.println("get value: "+m.get(t2));
		 t3= new ToDos("Tuesday");
		System.out.println("get value: "+m.get(t3));
		 t4= new ToDos("Monday");
		System.out.println("get value: "+m.get(t4));
	}
}

class ToDos{
	String day;
	ToDos(String d){
		day=d;
	}
	public boolean equals(Object o){
		return ((ToDos)o).day.equals(this.day);
	}
	//public int hashCode(){return this.day.hashCode();}
}