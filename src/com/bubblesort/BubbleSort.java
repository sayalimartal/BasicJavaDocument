//To sort an array using Bubblesort technique
package com.bubblesort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int length=15;
		int[] array=new int[length];    //Create an array of integers 
		int i,j,swap;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the array elements");
		for(i=0;i<length;i++)          //Input array elements
			array[i]=scanner.nextInt();
		scanner.close();
		
		for(i=0;i<length-1;i++)
		{
			for(j=0;j<length-i-1;j++)
			{
				if(array[j]>array[j+1])  //Sort the array in ascending order
				{
					swap=array[j];   
					array[j]=array[j+1];
					array[j+1]=swap;
				}
			}				
		}
		
		System.out.println("The sorted array is");
		for(i=0;i<length;i++)      //Display the sorted array
			System.out.print(array[i]+" ");
	}

}
