/**
 * 
 */
package com.demo.lambda;

import java.util.Optional;

/**
 * @author kvasim
 *
 */
public class OptionalDemo {
	public static void main(String[] args){
		Optional<String> fullName= Optional.ofNullable("Wasim Khan");
		System.out.println("Full Name is set ?: "+fullName.isPresent());
		System.out.println("Full Name :"+fullName.orElseGet(()->"[none]"));
		System.out.println(fullName.map(s -> "Hey "+ s + "!").orElse("Hey Stranger !:"));
	}

}
