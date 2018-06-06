/**
 * 
 */
package com.demo.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author kvasim
 *
 */
public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lambdaDemoForInteger();
		functionalInterfaceDemo();
		//List<String> list = lambdaDemo1();
		/*
		//Sorting
		list.sort((e1,e2)-> {
			int result=e1.compareTo(e2);
			return result;
		});
		System.out.println("After sorting--------");
		list.forEach(e->System.out.println(e));
		
		//Sorting 2:
		list.sort((e1,e2)->e1.compareTo(e2));
		list.forEach(a->System.out.print(a+" "));
		*/
	}

	private static void functionalInterfaceDemo() {
		List<Integer> integerList= Arrays.asList(1,2,3,4,5);
		Consumer<Integer> consumer=x->System.out.print(x);
		//integerList.forEach(consumer);
		integerList.forEach((java.util.function.Consumer<? super Integer>) consumer);
	}

	void forEach(Consumer<Integer> action){
		List<Integer> items= Arrays.asList(1,2,3,4,5);
		for(Integer i:items){
			action.accept(i);
		}
	}
	private static List<String> lambdaDemo1() {
		List<String> list= Arrays.asList("a","b","c","d");
		list.forEach(e->System.out.println(e));
		return list;
	}
	private static List<Integer> lambdaDemoForInteger() {
		List<Integer> integerList= Arrays.asList(1,2,3,4,5);
		integerList.forEach(x->{
			x=x+10;
			System.out.println(x);
			});
		return integerList;
	}
	private static List<Integer> lambdaDemoForInteger2() {
		List<Integer> integerList= Arrays.asList(1,2,3,4,5);
		integerList.forEach((Integer x)->{
			x=x+10;
			System.out.println(x);
			});
		return integerList;
	}
	
}
