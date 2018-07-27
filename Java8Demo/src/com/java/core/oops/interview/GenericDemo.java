package com.java.core.oops.interview;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {

		// Define the generic type....
		List<GenericDemo> gList=new ArrayList<>();
		Dog dog= new Dog();
		Cat cat= new Cat();
		gList.add(dog);
		gList.add(cat);
	}

}



class Dog extends Cat{
	
}
class Cat extends GenericDemo{
	
}