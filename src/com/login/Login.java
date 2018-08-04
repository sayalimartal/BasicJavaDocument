//Allow valid user login
package com.login;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		int flag=0,count=0;
		
		Scanner scanner=new Scanner(System.in);
		
		while(flag==0)  //For invalid login attempts
		{
			System.out.println("Enter the login name");
			String loginName=scanner.nextLine();
			
			System.out.println("Enter the password");
			String password=scanner.nextLine();
			
			scanner.close();
			
			//If valid login credentials entered, print Welcome message along with username
			if(loginName.equals("sayali") && password.equals("say@123")) 
			{
				System.out.println("Welcome "+loginName);
				flag=1;
				break;
			}
			else  //Keep track of invalid login attempts
				count++;
			
			if(count==3)   //Terminate program after three invalid attempts
			{
				System.out.println("Contact Admin");
				break;
			}
		}
	}
}