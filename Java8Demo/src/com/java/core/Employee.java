package com.java.core;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1650135988074943056L;
	/**
	 * 
	 */
	/**
	 * 
	 */
	private int empNum;
	private String empName;
	private String companyName;
	public Employee(int empNum,String empName,String companyName){
		this.empNum=empNum;
		this.empName=empName;
		this.companyName=companyName;
		
	}
	public Employee(){
		super();
	}
	
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empNum;
		return result;
	}
*/	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 *	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empNum != other.empNum)
			return false;
		return true;
	} */
	
	@Override
	public int hashCode() {
		return 1;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	/*@Override
	public boolean equals(Object obj) {
		return true;
	}*/
	
	
}
