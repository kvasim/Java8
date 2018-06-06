/**
 * 
 */
package com.demo.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author KVASIM
 *
 */
public class Unit1ExerciseWithLambda {

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
		printConditionally(people,p->true);

		// Step3 :: Create a method that prints all people that last name start
		// with k
		printConditionally(people, (Person p) -> p.getLastName()
				.startsWith("K"));

		printConditionally(people, (Person p) ->p.getFirstName().startsWith("W"));
	}

	private static void printConditionally(List<Person> people,
			Condition condition) {
		System.out
				.println("=============================================================");
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}

		}

	}
}
