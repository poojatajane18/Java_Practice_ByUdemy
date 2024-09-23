package com.SetterGetter;

import java.util.Scanner;

public class DateTest {
	private static Scanner sc = new Scanner(System.in);
	
	private Date date = new Date();
	
	public void acceptRecord() {
		System.out.println("Day : ");
		this.date.setDay(sc.nextInt());
		
		System.out.println("Month : ");
		this.date.setMonth(sc.nextInt());
		
		System.out.println("Year : ");
		this.date.setYear(sc.nextInt());
	}
	public void printRecord() {
		System.out.println(this.date.getDay()+" /"+this.date.getMonth()+" /"+this.date.getYear());
	}
	public static int menuList(){
		System.out.println("0.Exit ");
		System.out.println("1. Accept Record ");
		System.out.println("2. Print Record ");
		System.out.println("Enter choice :  ");
		return sc.nextInt();
	}
	

}
