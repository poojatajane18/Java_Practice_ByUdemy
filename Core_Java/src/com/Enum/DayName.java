package com.Enum;

enum Day{
	MON("Monday"), TUES("Tuesday"),WED("Wednesday");
	private String dayName;
	private Day(String dayName) {
		this.dayName = dayName;
	}
	
	public String getDayName() {
		return dayName;
	}
}

public class DayName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day = Day.MON;
		System.out.println(day.name());  //MON
		System.out.println(day.ordinal());  //0
		System.out.println(day.getDayName());  //Monday

	}

}
