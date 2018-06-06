/**
 * 
 */
package com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kvasim
 *
 */
public class Java8Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> names1 = new ArrayList<String>();
	      names1.add("Mahesh ");
	      names1.add("Suresh ");
	      names1.add("Ramesh ");
	      names1.add("Naresh ");
	      names1.add("Kalpesh ");
			
	      List<String> names2 = new ArrayList<String>();
	      names2.add("Mahesh ");
	      names2.add("Suresh ");
	      names2.add("Ramesh ");
	      names2.add("Naresh ");
	      names2.add("Kalpesh ");
			
	      Java8Tester tester = new Java8Tester();
	      System.out.println("Sort using Java 7 syntax: ");
			
	      tester.sortUsingJava7(names1);
	      System.out.println(names1);
	      System.out.println("Sort using Java 8 syntax: ");
			
	      tester.sortUsingJava8(names2);
	      System.out.println(names2);
	   }
	   
}
