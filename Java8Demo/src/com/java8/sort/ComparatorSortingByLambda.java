package com.java8.sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSortingByLambda {

	public static void main(String[] args) {

		List<Developer> listDevs=getDevelopers();
		System.out.println(" Befor sorting**********");
		/*for(Developer dev:listDevs) {
			System.out.println(dev);
		}*/
		listDevs.forEach((developer)->System.out.println(developer));
		
		//Sorting
		/*Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer d1, Developer d2) {
				return d1.getAge()-d2.getAge();
			}
		});*/
		listDevs.sort((d1,d2)->d1.getAge()-d2.getAge());
		System.out.println("***  After sort *****");
		/*for(Developer dev:listDevs) {
			System.out.println(dev);
		}*/
		listDevs.forEach((dev)->System.out.println(dev));
		
		//sort by name
		/*Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
*/
		listDevs.sort((d1,d2)->d1.getName().compareTo(d2.getName()));
		System.out.println("---------- Sorting by Name---------------");
		listDevs.forEach(dev->System.out.println(dev));
		//sort by salary
/*		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}
		});
*/
	listDevs.sort((d1,d2)->d1.getSalary().intValue()-d2.getSalary().intValue());
	System.out.println("---------- Sorting by salary---------------");
	listDevs.forEach(dev->System.out.println(dev));
	}

	private static List<Developer> getDevelopers() {
		List<Developer> list= new ArrayList<>();
		list.add(new Developer("Wasim",new BigDecimal(200),33));
		list.add(new Developer("Khan",new BigDecimal(7000),13));
		list.add(new Developer("Zarin",new BigDecimal(33000),55));
		list.add(new Developer("Alam",new BigDecimal(-5000),32));
		list.add(new Developer("Hiba",new BigDecimal(13000),44));
		
		return list;
	}

}
