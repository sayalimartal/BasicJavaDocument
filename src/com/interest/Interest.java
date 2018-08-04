//Calculate simple and compound interest for a value
package com.interest;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the principle amount, time period and rate of interest"); 
		double p=scanner.nextDouble();  //Input principle amount,time period and rate of interest
		double n=scanner.nextDouble();
		double r=scanner.nextDouble();
		
		scanner.close();
		
		double simpleInterest=(p*n*r)/100;   //Calculate simple interest
		double compoundInterest=(p*Math.pow(1+(r/100),n))-p;   //Calculate compound interest
		
		System.out.println("Simple interest is "+simpleInterest);  //Display simple interest
		System.out.println("Compound interest is "+compoundInterest);//Display compound interest
	}

}
