package com.java.core.collection.list;

public class CustomeArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CustomeList<String> custList= new CustomeArrayList<>();
		custList.add("Wasim");
		custList.add("Khan");
		custList.add("Salman");
		custList.add("Tanvir");
		/*custList.add("Wasim");
		custList.add("Khan");
		custList.add("Salman");
		custList.add("Tanvir");*/
		
		System.out.println(custList.get(2));
		System.out.println(custList.get(3));
		System.out.println(" List size  = "+custList.size());
		System.out.println(custList);
		custList.remove(2);
		System.out.println(custList);
		
		
	}

}
