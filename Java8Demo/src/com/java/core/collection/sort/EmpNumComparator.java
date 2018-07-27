package com.java.core.collection.sort;

import java.util.Comparator;

import com.java.core.Employee;

public class EmpNumComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmpNum()==o2.getEmpNum())  
			return 0;  
			else if(o1.getEmpNum()>o2.getEmpNum())  
			return 1;  
			else  
			return -1;  
	}

}
