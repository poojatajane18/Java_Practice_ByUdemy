package com.Array;

import java.util.Scanner;

class Institute{
	private int index;
	private Employee[] arr;
	public Institute() {
		// TODO Auto-generated constructor stub
		this(5);  //Constructor chaining
	}
	public Institute(int capacity) {
		this.arr = new Employee[capacity];
	}
	public void addNewEmployee(Employee emp) {
		// TODO Auto-generated method stub
		if(index < this.arr.length) {
			this.arr[index] = emp;
			index = index+1;
		}	
	}
	public Employee findEmployee(int empid) {
		for(Employee emp : this.arr) {
			if(emp.getEmpid()==empid)
				return emp;
		}
		return null;
	}
	public boolean removeEmployee(int empid) {
		for(int index=0; index<arr.length;index++) {
			if(this.arr[index] !=null && this.arr[index].getEmpid() == empid) {
				this.arr[index]=null;
				return true;
			}
		}
		return false;
	}
	public void printAllEmployee() {
		for(Employee emp : this.arr)
			if(emp!=null)
				System.out.println(emp);
	}

}


public class SingleDimensional {
	
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(Employee emp) {
		// TODO Auto-generated method stub
		System.out.print("Name : ");
		sc.nextLine();
		emp.setName(sc.nextLine());
		System.out.print("Empid : ");
		emp.setEmpid(sc.nextInt());
		System.out.print("Salary : ");
		emp.setSalary(sc.nextFloat());
		
	}

	private static void printRecord(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println(emp.toString());
	}
	public static int menuList() {
		System.out.println("0.Exit : ");
		System.out.println("1.Add new Employee : ");
		System.out.println("2.Find Employee : ");
		System.out.println("3.Remove Employee : ");
		System.out.println("4.Print Employee : ");
		System.out.println("Enter choice : ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		int choice;
		Institute institute = new Institute(5);
		while((choice = SingleDimensional.menuList()) !=0) {
			switch (choice) {
			case 1: 
				Employee emp = new Employee();
				SingleDimensional.acceptRecord(emp);
				institute.addNewEmployee(emp);
				break;
			case 2:
				System.out.println("Enter employee id : ");
				Employee value=institute.findEmployee(sc.nextInt());
				System.out.println(value);
				break;
			case 3:
				System.out.println("Enter employee id : ");
				boolean removedStatus= institute.removeEmployee(sc.nextInt());
				System.out.println(removedStatus ? "Employee is removed " : "Employee not found");
				break;
			case 4:
				institute.printAllEmployee();
				break;
			
			}
		}
	}
	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		SingleDimensional.acceptRecord(emp);
		SingleDimensional.printRecord(emp);
		
	}

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*private static Employee[] getArray() {
		// TODO Auto-generated method stub
		Employee[] arr = new Employee[3];
		arr[0] = new Employee("Pooja",11,4000.60f);
		arr[1] = new Employee("Swati",17,9000.60f);
		arr[2] = new Employee("Mahesh",10,10000.60f);
		return arr;
	}
	private static void printRecord(Employee[] arr) {
		// TODO Auto-generated method stub
		if(arr !=null) {
			for(Employee emp : arr)
				System.out.println(emp.toString());
		}
	}
	
	public static void main3(String[] args) {
		Employee[] arr = SingleDimensional.getArray();
		SingleDimensional.printRecord(arr);
	}

	*/
	

	/*public static void main2(String[] args) {
		// TODO Auto-generated method stub
		Employee[] arr = SingleDimensional.getArray();
		for(Employee emp : arr)
			System.out.println(emp.toString());

	}*/
	
	

	/*public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Employee[] arr = new Employee[3];
		arr[0] = new Employee("Pooja",11,4000.60f);
		arr[1] = new Employee("Swati",17,9000.60f);
		arr[2] = new Employee("Mahesh",10,10000.60f);
		*/

	

}
