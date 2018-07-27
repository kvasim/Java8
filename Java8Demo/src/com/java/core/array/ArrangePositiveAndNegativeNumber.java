package com.java.core.array;

public class ArrangePositiveAndNegativeNumber {

	public static void main(String[] args) {
		
		System.out.println(5/2);
		System.out.println(6/2);
		System.out.println(13/2);
		

		final int[] randomArray= {11,-4, -1,2,8,-2,5,-44,9,-99};
		
		//int[] newArray = arrangePositiveAndNegativeArray(randomArray);
		 reArrangePosNeg(randomArray);
		
		//printArray(randomArray);
	}

	private static void printArray(int[] randomArray) {
		for(int num:randomArray) {
			System.out.print(" "+ num);
			}
		
	}

	private static int[] arrangePositiveAndNegativeArray(final int[] randomArray) {
		
		int[] negArr= new int[randomArray.length];
		int[] posArr= new int[randomArray.length];
		int posCounter = 0,negCounter=0;
		
		for(int num:randomArray) {
			if(num<0) {
				negArr[negCounter++]=num;
			}else {
				posArr[posCounter++]=num;
			}
		}
		int[] tempArr= new int[randomArray.length];
		int counter=0;
		for(int i=0;i<negCounter;i++) {
			tempArr[counter++]=negArr[i];
		}
		for(int i=0;i<posCounter;i++) {
			tempArr[counter++]=posArr[i];
		}
		
		
		return tempArr;
	}

	static void reArrangePosNeg(int arr[])
    {
        int key, j;
        for(int i = 1; i < arr.length; i++)
        {
            key = arr[i];
     
            // if current element is positive
            // do nothing
            if (key > 0)
                continue;
     
            /* if current element is negative,
            shift positive elements of arr[0..i-1],
            to one position to their right */
            j = i - 1;
            while (j >= 0 && arr[j] > 0)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
     
            // Put negative element at its right position
            arr[j + 1] = key;
        }
    }
     
}
