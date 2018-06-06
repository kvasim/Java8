/**
 * 
 */
package com.demo.interview;

/**
 * @author KVASIM
 *
 */
public class Employee {

	private int id;
	private String name;
	private String address;
	private int mobNumber;
	
	public Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the mobNumber
	 */
	public int getMobNumber() {
		return mobNumber;
	}
	/**
	 * @param mobNumber the mobNumber to set
	 */
	public void setMobNumber(int mobNumber) {
		this.mobNumber = mobNumber;
	}
}
