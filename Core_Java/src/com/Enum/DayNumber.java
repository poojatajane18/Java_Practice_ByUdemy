package com.Enum;

enum Day1{
	MON(1),TUES(2),WED(3);
	
	private int dayNumber;
	
	private Day1(int dayNumber) {
		this.dayNumber = dayNumber;
	}
	public int getDayNumber() {
		return dayNumber;
	}
}

public class DayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1 d = Day1.MON;
		System.out.println(d.name()); //MON
		System.out.println(d.ordinal()); //0
		System.out.println(d.getDayNumber());//1

	}

}
