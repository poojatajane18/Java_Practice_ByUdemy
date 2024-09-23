package com.Enum;

enum Day2{
	//MON(1,"Monday"),TUES(2,"Tuesday"),WED(3,"Wednesday");
	MON("Monday"),TUES(2),WED(3,"Wednesday");
	
	private int dayNumber;
	private String dayName;
	
	private Day2(String dayName) {
		this.dayName = dayName;
	}
	
	private Day2(int dayNumber) {
		this.dayNumber = dayNumber;
	}
	
	private Day2(int dayNumber,String dayNmae) {
		this.dayNumber = dayNumber;
		this.dayName = dayNmae;
	}
	
	public int getDayNumber() {
		return dayNumber;
	}
	public String getDayName() {
		return dayName;
	}
	
	public String toString() {
		 return String.format("%-10s%-5d%-10s%-5d", this.name(),this.ordinal(), this.dayName, this.dayNumber);
		 }
}

public class WeekValue {
	
	//If we Want to next day information then
	public static void main(String[] args) {
		Day2 day = Day2.MON;
		int index = day.ordinal();
		Day2[] arr = Day2.values();
		
		day = arr[index+1];
		System.out.println(day);
	}
	
	public static void main2(String[] args) {
		Day2[] days = Day2.values();
		for(Day2 day : days)
			System.out.println(day.toString());	
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Day2 days = Day2.MON;
		System.out.println(days.name());  //MON
		System.out.println(days.ordinal());//0
		System.out.println(days.getDayNumber());//1
		System.out.println(days.getDayName());//Monday

	}

}
