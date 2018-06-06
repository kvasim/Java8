/**
 * 
 */
package com.demo.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author KVASIM
 *
 */
public class Unit1ExerciseWithFunctionalInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Wasim", "Khan", 30),
				new Person("Rohan", "KSingh", 22), new Person("Karan", "John",
						44), new Person("Tanvir", "Ansari", 54), new Person(
						"Karz", "Firz", 12));

		// Step1 :: Sort List by last name

		Collections.sort(people, (Person arg0, Person arg1) -> arg0
				.getLastName().compareTo(arg1.getLastName()));

		// Step2 :: Create a method that prints all elements in the list
		printConditionally(people, p -> true,p-> System.out.println(p));

		// Step3 :: Create a method that prints all people that last name start
		// with k
		printConditionally(people, (Person p) -> p.getLastName()
				.startsWith("K"),p-> System.out.println(p));

		printConditionally(people,
				(Person p) -> p.getFirstName().startsWith("W"),p-> System.out.println(p));
		//Print only name
		printConditionally(people, p->true, p->System.out.println(p.getFirstName()));
	}

	private static void printConditionally(List<Person> people,
			Predicate<Person> condition,Consumer<Person> consume) {
		System.out
				.println("=============================================================");
		for (Person p : people) {
			if (condition.test(p)) {
				consume.accept(p);
			}

		}

	}
}
