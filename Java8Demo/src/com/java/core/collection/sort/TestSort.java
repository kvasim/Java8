package com.java.core.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort {

	public static void main(String[] args) {
		List<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));
		
		Collections.sort(al);
		
		for (Student st : al) {
			System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());

		}

	}
}
