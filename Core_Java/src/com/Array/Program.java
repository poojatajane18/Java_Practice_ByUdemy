package com.Array;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating an arrays 
		
				int subject[] = new int[40];
				
				int numbers[] = {1,2,3,4};
				
				String name[] = {"Pooja","Pranali","Mahesh"};
				
				//Insert the value in the array
				int marks[] = new int[40];
				
				Scanner sc = new Scanner(System.in);
				marks[0]=sc.nextInt();
				marks[1]=sc.nextInt();
				marks[2]=sc.nextInt();
				
				//Output
				System.out.println("Length of the array = "+marks.length);
				System.out.println("Physics = "+marks[0]);
				System.out.println("Chemistry = "+marks[1]);
				System.out.println("Math = "+marks[2]);
				
				
				//Updating the values
				marks[2]=56;
				System.out.println("Math updated value = "+marks[2]);
				
				marks[1]=marks[1]+1;
				System.out.println("Add one marks in Chemistry = "+marks[1]);
				
				int per = (marks[0]+marks[1]+marks[2])/3;
				System.out.println("Percentage = "+per+ "%");
			

	}

}

/*Output : 
 * 
78
67
90
Length of the array = 40
Physics = 78
Chemistry = 67
Math = 90
Math updated value = 56
Add one marks in Chemistry = 68
Percentage = 67%
*/

