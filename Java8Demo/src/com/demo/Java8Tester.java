/**
 * 
 */
package com.demo;

import java.util.Collections;
import java.util.List;
import java.util.Comparator;

import com.demo.Java8Example2.MathOperation;

/**
 * @author kvasim
 *
 */
public class Java8Tester {

	public void sortUsingJava7(List<String> names){   
	      Collections.sort(names, new Comparator<String>() {
	         @Override
	         public int compare(String s1, String s2) {
	            return s1.compareTo(s2);
	         }
	      });
	   }
	   
	   //sort using java 8
	   public void sortUsingJava8(List<String> names){
	      Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	   }

	  int operate(int a, int b, MathOperation mathOperation){
	      return mathOperation.operation(a, b);
	   }
}
