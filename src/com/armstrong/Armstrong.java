// To find if given number is an Armstrong number
package com.armstrong;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		int number,remainder,sum=0,numbercopy;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number");
		number=scanner.nextInt(); //Input a number
		scanner.close();
		
		numbercopy=number;        //Copy the number  
		while(number>0)
		{
			remainder=number%10;
			sum=sum+(remainder*remainder*remainder);
			number=number/10;
		}                         //Store the sum of cubes of digits of the number in 'sum'
		
		if(numbercopy==sum)       //If number is equal to sum, it is Armstrong
			System.out.println("Armstrong number");
		else
			System.out.println("Not an Armstrong number");	
	}

}
