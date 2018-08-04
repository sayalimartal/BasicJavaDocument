//Declare result based on marks
package com.marks;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		int mark1,mark2,mark3;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the marks for three subjects");
		mark1=scanner.nextInt(); //Input marks for three subjects
		mark2=scanner.nextInt();
		mark3=scanner.nextInt();
		
		scanner.close();
		
		System.out.print("Result is ");
		
		if(mark1>=60 && mark2>=60 && mark3>=60) //Display result based on marks
			System.out.println("Passed");
		else if((mark1>=60 && mark2>=60 && mark3<60) || (mark1>=60 && mark3>=60 && mark2<60) || (mark2>=60 && mark3>=60 && mark1<60))
			System.out.println("Promoted");
		else
			System.out.println("Failed");
	}

}
