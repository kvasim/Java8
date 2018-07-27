package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {

		int width=10;
		Drawable drawable= new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("Draw method overriden");
				
			}
		};
		
		drawable.draw();
		Drawable drawable1=()->System.out.println(" This is Lambda example ");
		drawable1.draw();
	
	 List<String> list=new ArrayList<String>(); 
	 list.add("ankit");  
	 list.add("mayank");  
     list.add("irfan");  
     list.add("jai"); 
     
     list.forEach(value->System.out.println(value));
     
	}
}
interface Drawable{
	void draw();
}