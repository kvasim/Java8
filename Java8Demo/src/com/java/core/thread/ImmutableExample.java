package com.java.core.thread;

public final class ImmutableExample {

	ImmutableExample(){
		
	}
	
	private final int[] array=new int[4];
	private final String name="Wasim";
	private final String address="Delhi";
	

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getArray() {
		return array[1]+" "+array[2];
	}

	
	
	
	
}
