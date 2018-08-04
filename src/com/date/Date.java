//To display the entered date(dd,mm,yyyy) in the form dd/MonthName/yyyy
package com.date;

import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the complete date in the form (DD,MM,YYYY)");
		String date=scanner.nextLine();  //Store the date input in a string
		scanner.close();
		
		String[] dmy=date.split(",");    //Separate the string at each comma and store in a string array
		System.out.print(dmy[0]+"/");    //Display the day
		
		switch(dmy[1])                   //Display the month name according to the month number
		{
			case "1":
			case "01":System.out.print("January");
				      break;
			case "2":
			case "02":System.out.print("February");
				  	  break;
			case "3":
			case "03":System.out.print("March");
				  	  break;
			case "4":
			case "04":System.out.print("April");
					  break;
			case "5":
			case "05":System.out.print("May");
				  	  break;
			case "6":
			case "06":System.out.print("June");
					  break;
			case "7":
			case "07":System.out.print("July");
				  	  break;
		    case "8":
			case "08":System.out.print("August");
					  break;
			case "9":
			case "09":System.out.print("September");
				  	  break;
		    case "10":System.out.print("October");
		              break;
			case "11":System.out.print("November");
			          break;
		    case "12":System.out.print("December");
		              break;
			default:System.out.print("Invalid month");
			          break;			  
		}
		
		System.out.println("/"+dmy[2]);   //Display the year
	}

}
