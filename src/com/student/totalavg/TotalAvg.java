//Find total and average scored by each student and in each subject
package com.student.totalavg;

import java.util.Scanner;

public class TotalAvg {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner scanner=new Scanner(System.in);
		int[][] mark=new int[3][3];  //Two dimensional array to store marks of 3 students for 3 subjects each
		
		for(i=0;i<3;i++)
		{
			System.out.println("Enter marks for student "+(i+1));
			for(j=0;j<3;j++)
				mark[i][j]=scanner.nextInt(); //Input marks for 3 students for 3 subjects each
		}
		
		scanner.close();
		
		int[] total={0,0,0};
		float[] avg={0,0,0};
		
		System.out.print("Total scored in each subject is ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			total[i]+=mark[j][i];
			System.out.print(total[i]+" ");  //Display total scored in each subject by 3 students
			avg[i]=total[i]/3.0f;
		}
		
		System.out.print("\nAverage scored in each subject is ");
		for(i=0;i<3;i++)
			System.out.print(avg[i]+" ");  //Display average scored in each subject by 3 students
		
		int[] totalStudent={0,0,0};
		float[] avgStudent={0,0,0};
		
		System.out.print("\nTotal scored by each student is ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			totalStudent[i]+=mark[i][j];
			System.out.print(totalStudent[i]+" ");  //Display total scored by each student
			avgStudent[i]=totalStudent[i]/3.0f;
		}
		
		System.out.print("\nAverage scored by each student is ");
		for(i=0;i<3;i++)
			System.out.print(avgStudent[i]+" ");  //Display average scored by each student
	}

}
