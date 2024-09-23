package com.Comparator_Comparable;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Program {
	public static Employee[] getArray() {
	    Employee[] arr = new Employee[5]; // Array of references
	    // Array of instances
	    arr[0] = new Employee(7369, "pooja", "Tajane", 7902, LocalDate.parse("1980-12-11"), 800.00f, 0, 20);
	    arr[1] = new Employee(7389, "Swati", "Tajane", 7902, LocalDate.parse("1999-10-15"), 800.00f, 800.0f, 20);
	    arr[2] = new Employee(7069, "Mahesh", "shinde", 7902, LocalDate.parse("1989-11-02"), 800.00f, 780.89f, 20);
	    arr[3] = new Employee(7269, "Umesh", "Gaikwad", 7902, LocalDate.parse("1992-09-10"), 800.00f, 540.87f, 20);
	    arr[4] = new Employee(7169, "Rekha", "Tajane", 7902, LocalDate.parse("2000-07-19"), 800.00f, 0, 20);
	    return arr;
	}

	public static void printRecord(Employee[] arr) {
		if(arr != null) {
			for(Employee emp : arr)
				System.out.println(emp);
		}
		System.out.println();
	}
	private static Scanner sc = new Scanner(System.in);
	
	public static int menuList() {
		System.out.println("0.Exir");
		System.out.println("1. Name");
		System.out.println("2.Job");
		System.out.println("3.DeptNo");
		System.out.println("4.HireDate");
		System.out.println("Enter choice : ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		Employee[] arr = Program.getArray();
		while((choice = Program.menuList()) != 0) {
			Comparator<Employee> comparator = null;
			switch(choice) {
			case 1 :
				comparator = new NameComparator();
				break;
			case 2 :
				comparator = new JobComparator();
				break;
			case 3 :
				comparator = new DeptNumberComparator();
				break;
			case 4 :
				comparator = new HireDateComparator();
				break;
			}
			Arrays.sort(arr,comparator);
			Program.printRecord(arr);
		}
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Employee[] arr = Program.getArray();
		Program.printRecord(arr);
		
		Comparator<Employee> comparator = null;
		
		comparator = new DeptNumberComparator();
		Arrays.sort(arr,comparator);
		Program.printRecord(arr);
		
		comparator = new HireDateComparator();
		Arrays.sort(arr,comparator);
		Program.printRecord(arr);
		

	}

}
