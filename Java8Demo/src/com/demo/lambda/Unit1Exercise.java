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
public class Unit1Exercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Wasim", "Khan", 30),
				new Person("Rohan", "KSingh", 22), new Person("Karan", "John",
						44), new Person("Tanvir", "Ansari", 54), new Person(
						"Karz", "Firz", 12));
		// Step1 :: Sort List by last name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.getLastName().compareTo(arg1.getLastName());
			}
		});
		// Step2 :: Create a method that prints all elements in the list
		printAll(people);
		// Step3 :: Create a method that prints all people that last name start
		// with k
		printLastNameStartWithK(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("K");
			}
		});
		printLastNameStartWithK(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("T");
			}
		});
	}
	private static void printLastNameStartWithK(List<Person> people,
			Condition condition) {
		System.out
				.println("=============================================================");
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}
	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}
}
