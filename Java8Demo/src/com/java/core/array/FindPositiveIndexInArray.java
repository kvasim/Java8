package com.java.core.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FindPositiveIndexInArray {
	
	public static void main(String[] args) throws IOException {
		/* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name2 = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi next, " + name2 + ".");    // Writing output to STDOUT

  */

		 BufferedReader br = null;
	        try {
	            br = new BufferedReader(new InputStreamReader(System.in));
	            System.out.println(" Total Test ");
	            String noOfTest = br.readLine();
	            int totalTest = Integer.parseInt(noOfTest);
	            for(int i=0;i<totalTest;i++) {
	            	System.out.println(" Total Element ");
	                String totalElement = br.readLine();
	                int totalElements = Integer.parseInt(totalElement);
	                System.out.println(" Element ");
	                String line = br.readLine();
	                String strArr[] = line.split(" ");
	                int elements[] = new int[strArr.length];
	                for(int j=0;j<strArr.length;j++) {
	                    elements[j] = Integer.parseInt(strArr[j]);
	                }
	             /*for(int k:elements) {
	            	 System.out.print(" "+k);
	             }*/
	               System.out.println(findPositiveIndex(elements));
	            }
	        }catch(Exception e) {
	            throw e;
	        }
	        finally {
	            if(br!=null)
	                br.close();
	        }

	}
	public static int findPositiveIndex(int[] arr) {
	    int min=arr[0],max=arr[0],minIndex=0,maxIndex=0;
	    int maximumIndex = 0;
	    for(int i=0;i<arr.length;i++){
	        min = arr[i];
	        minIndex=i;
	        boolean isMaxPresent = false;
	        for(int j=i;j<arr.length;j++)
	        {
	            if(arr[j] > min){
	                max = arr[j];
	                maxIndex = j;
	                isMaxPresent = true;
	            }
	        }
	        if(maximumIndex < ((maxIndex - minIndex) +1) )
	            maximumIndex = (maxIndex - minIndex) + 1;
	    }
	    return maximumIndex;

	}
}
