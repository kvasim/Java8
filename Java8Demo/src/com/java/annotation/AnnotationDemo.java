package com.java.annotation;
@SuppressWarnings("all")
public class AnnotationDemo {

	private String name;
	private int id;
	
	private String address;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i:arr){
			System.out.println(i);
		}

	}

	
	public String getName() {
		return name;
	}

	@Mutator1("Khan")
	public void setName(String name) {
		this.name = name;
	}

	@Mutator2(variable="11")
	public int getId() {
		return id;
	}

	@Mutator3(valuexxx = "")
	public void setId(int id) {
		this.id = id;
	}

	
}
