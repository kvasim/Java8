package com.java.core.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.java.core.Employee;

public class TestComparator {

	public static void main(String[] args) {
		List<Employee> al=new ArrayList<Employee>();  
		al.add(new Employee(101,"Vijay","Ford"));  
		al.add(new Employee(106,"Ajay","HCL"));  
		al.add(new Employee(105,"Jai","IBM"));  
		  
		System.out.println("Sorting by EmpNum...");  
		  
		Collections.sort(al,new EmpNumComparator());  
		for(Employee emp: al){  
		System.out.println(emp.getEmpNum()+" "+emp.getEmpName()+" "+emp.getCompanyName());  
		}  
		  
		System.out.println("sorting by Name...");  
		  
		Collections.sort(al,new NameComparator());  
		for(Employee emp: al){  
			System.out.println(emp.getEmpNum()+" "+emp.getEmpName()+" "+emp.getCompanyName());  
			}  
		  
		System.out.println("sorting by Compnay...");  
		  
		Collections.sort(al,new CompanyNameComparator());  
		for(Employee emp: al){  
			System.out.println(emp.getEmpNum()+" "+emp.getEmpName()+" "+emp.getCompanyName());  
			}  
		  

	}

}
