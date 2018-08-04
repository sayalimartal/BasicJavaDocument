//Calculate income tax based on income range
package com.tax;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		
		double ctc,tax=0;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the CTC");
		ctc=scanner.nextDouble();  //Input ctc
		
		scanner.close();
		
		if(ctc>=0 && ctc<=180000)  //Calculate tax based on ctc
			tax=0;
		else if(ctc>=180001 && ctc<=300000)
			tax=ctc*10/100;
		else if(ctc>=300001 && ctc<=500000)
			tax=ctc*20/100;
		else if(ctc>=500001 && ctc<=1000000)
			tax=ctc*30/100;
		else
			System.out.println("Invalid Input");
		
		if(ctc>=0 && ctc<=1000000)  //Display tax amount for valid ctc input
			System.out.println("Tax amount is "+tax);
	}

}
