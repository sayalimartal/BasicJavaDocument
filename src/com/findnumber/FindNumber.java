//Find if a given element is present in a given array 
package com.findnumber;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		
		int[] array=new int[15];   //Create an array of integers of size 15
		int i,flag=0;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter distinct array elements");
		for(i=0;i<15;i++)         //Input the array
			array[i]=scanner.nextInt();
		
		System.out.println("Enter the element to be searched");
		int number=scanner.nextInt();  //Input the element to be searched
		
		scanner.close();
		
		for(i=0;i<15;i++)
		{
			if(array[i]==number)   //Compare every array element with the number. If match found, do not compare ahead and display position
			{
				System.out.println("Element "+number+" found at position "+(i+1));
				flag=1;
				break;
			}		
		}
		
		if(flag==0)       //If element not present in array, display that element not found in array
			System.out.println("Element "+number+" not found in the array");
	}

}
