//To find Armstrong numbers in a given range of numbers
package com.armstrongrange;

public class ArmstrongRange {

	public static void main(String[] args) {
		
		int remainder,sum=0,number,a=100,b=999;
		
		System.out.println("Armstrong numbers from "+a+" to "+b+" are");
		for(int i=a;i<b+1;i++)
		{
				sum=0;        //Initialize sum of cubes of digits for each number to be 0
				number=i;     //Copy the number 
			
				while(number>0)
				{
					remainder=number%10;
					sum=sum+(remainder*remainder*remainder);
					number=number/10;
				}            //Store the sum of cubes of digits of the number in 'sum'
			
				if(i==sum)   //If number is equal to sum, it is Armstrong, so display that number
					System.out.print(i+" ");
		}
	}
}
