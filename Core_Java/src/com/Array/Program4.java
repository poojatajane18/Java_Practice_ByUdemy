package com.Array;

import java.time.LocalDate;
import java.util.Arrays;

class Date{
	private int day;
	private int month ;
	private int year; 
	
	public Date() {
		LocalDate ld = LocalDate.now();
		this.day = ld.getDayOfMonth();
		this.month=ld.getMonthValue();
		this.year=ld.getYear();
	}
	
	public Date(int day,int month,int year) {
		this.day = day;
		this.month=month;
		this.year = year;
	}

	@Override
	public String toString() {
		return this.day+" / "+this.month+" / "+this.year;
	}
	
	
}

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date[] arr = new Date[3];
		//System.out.println(Arrays.toString(arr));  //[null, null, null]
		
		Date[] arr = new Date[ 3 ]; //Array of references
		for( int index = 0; index < arr.length; ++ index )
			 arr[ index ] = new Date();
		for( int index = 0; index < arr.length; ++ index )
			 System.out.println( arr[ index ].toString()); //OK

	}

}
