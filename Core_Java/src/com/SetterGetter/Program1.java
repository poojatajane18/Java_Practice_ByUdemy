package com.SetterGetter;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		DateTest test = new DateTest();
		while((choice = DateTest.menuList()) !=0) {
			switch(choice) {
				case 1 :
					test.acceptRecord();
					break;
				case 2 :
					test.printRecord();
					break;
			}
		}

	}

}
