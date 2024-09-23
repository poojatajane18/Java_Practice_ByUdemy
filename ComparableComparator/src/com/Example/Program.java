package com.Example;

import java.util.Arrays;

public class Program {
	
	public static Person[] getArray() {
		Person[] arr = new Person[5];
		arr[0] = new Student("Mahesh", 14);  	//Upcasting
		arr[1] = new Employee("Ganesh", 12);	//Upcasting
		arr[2] = new Student("Pooja", 18);		//Upcasting
		arr[3] = new Employee("Umesh", 22);		//Upcasting
		arr[4] = new Student("Shunham", 8);		//Upcasting
		return arr;
	}
	
	public static void printRecord(Person[] arr) {
		if(arr != null) {
			for(Person person : arr)
				System.out.println(person.toString()); //Dynamic Method Dispatch
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] arr = Program.getArray();
		Program.printRecord(arr);
		
		System.out.println("By compare using name");
		Arrays.sort(arr, new NameComparator());
		Program.printRecord(arr);
		
		System.out.println("By compare using ID");
		Arrays.sort(arr, new IdComparator());
		Program.printRecord(arr);
	}

}
