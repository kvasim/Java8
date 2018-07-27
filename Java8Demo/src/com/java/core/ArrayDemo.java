package com.java.core;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		/*Object obj=null;
		Company company=new Company();
		obj=company;
		Object[] arrayObj=new Object[10];*/
		
		
		
		int[] numArray=new int[6];
		
		numArray[0]=33;
		numArray[4]=11;
		
		numArray[3]=numArray[4];
		checkOutput();
		//[33][][][11][11][]
	}

	static void checkOutput(){
		 int[] x = {120, 200, 016 };
         for(int i = 0; i < x.length; i++)
                 System.out.print(x[i] + " ");
 }

	 static int[] oddNumbers(int l, int r) {
	        List<Integer> list= new ArrayList();
	        
	        for(int counter=l;counter<=r;counter++){
	            if(counter%2 !=0){
	                list.add(counter);
	            }
	            
	         }
	        int[] primitive = list.stream().mapToInt(Integer::intValue).toArray();


	        return primitive;
	    }

}
