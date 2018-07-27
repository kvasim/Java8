package com.java8.streamFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.lambda.Person;

/*
 * Java 8 examples to demonstrate the use of Streams filter(), collect(), findAny() and orElse()
 */
public class StreamFilterExample {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "springboot", "Hadoop", "wkhan");
		// Filter and collect example
		// filterTheGivenNameFromList(lines);

		// Streams filter(), findAny() and orElse()
		findTheEmployeeByName(getEmployeeList(), "Wasim");
	}

	private static void findTheEmployeeByName(List<Person> employeeList, String name) {

		/*
		 * Person
		 * pObj=employeeList.stream().filter(p->p.getFirstName().equals(name)).findAny()
		 * .orElse(null); System.out.println(pObj);
		 */

		Person pObj = employeeList.stream().filter(p -> applyCondition(p, name)).findAny().orElse(null);
		System.out.println(pObj);

	}

	private static List<Person> getEmployeeList() {
		List<Person> persons = Arrays.asList(new Person("Wasim", "Khan", 30), new Person("jack", "Ahmad", 20),
				new Person("lawrence", "ded", 40));
		return persons;
	}

	public static boolean applyCondition(Person p, String name) {
		if (p.getFirstName().equals(name) && p.getAge() == 30) {
			return true;
		} else {
			return false;
		}
	}

	private static void filterTheGivenNameFromList(List<String> lines) {
		List<String> filteredList = lines.stream(). // convert list to stream
				filter(line -> !"wkhan".equals(line)). // we dont like wkhan
				collect(Collectors.toList()); // collect the output and convert streams to a List

		filteredList.forEach(value -> System.out.println(value));
		System.out.println();
		filteredList.forEach(System.out::println);// Alternate Option

	}

}
