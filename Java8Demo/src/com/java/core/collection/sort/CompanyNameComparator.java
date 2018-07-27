package com.java.core.collection.sort;

import java.util.Comparator;

import com.java.core.Employee;

public class CompanyNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getCompanyName().compareTo(o2.getCompanyName());
	}


}
