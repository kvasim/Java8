package com.java.oop;

import java.util.Vector;

public class ObjectNullDemo {

	public static void main(String[] args) {
		//Object obj=null;
		String str=null;
		ObjectNullDemo demo= new ObjectNullDemo();
		demo.display(null);
		Vector obj = new Vector(4,2);
        obj.addElement(new Integer(3));
        obj.addElement(new Integer(2));
        obj.addElement(new Integer(5));
        System.out.println(obj.elementAt(3));
	}
	
	
	public void display(Object obj) {
		System.out.println(" This is object say method");
	}

	public void display(String str) {
		System.out.println("This is display method str---------");
	}
}
