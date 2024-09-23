package com.Basic;

public class InstanceCount {
	
	/*public static void printRecord() {
		//static int num=0;  Illegal modifier for parameter num; only final is permitted
		int count1 =0;  // local variable
		count1 = count1 +1;
		System.out.println("Count : "+count1);
		
	}*/
	
	private static int count = 0;
	public static void printRecord() {
		count = count +1;
		System.out.println("Count : "+count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*InstanceCount.printRecord();//1
		InstanceCount.printRecord();//1
		InstanceCount.printRecord();//1*/
		
		InstanceCount.printRecord();//1
		InstanceCount.printRecord();//2
		InstanceCount.printRecord();//3

	}

}
