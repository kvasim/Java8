/**
 * 
 */
package com.demo.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author kvasim
 *
 */
public class LambdaDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> list= Arrays.asList(1,2,3,5,7,9,11,12);
		/*list.forEach(new Consumer<Integer>() {
			public void accept(Integer vallue){
				System.out.println(vallue);
			}
		});*/
		
		//list.forEach(value->	System.out.println(value));
		/*list.forEach(System.out ::println);
		
		System.out.println(list.stream().map(e-> e*2).reduce(0,(c,e)->c+e));
		int val=list.stream().map(e-> e*2).reduce(0,(c,e)->c+e);
		System.out.println("val--"+val);
		
		Optional<Integer> result=list.stream().filter(e->e>3).filter(e->e%2==0).map(e->e*2).findFirst();
		System.out.println("result :"+result);*/
		
		
		
		
		
		
		
		
		
		
	}

}
