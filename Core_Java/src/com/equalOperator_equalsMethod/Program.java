package com.equalOperator_equalsMethod;

public class Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 10;
		if(num1 == num2) //OK
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");
		//Output : Equal

	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 10;
		/*if(num1.equals(num2)) //Cannot invoke equals(int) on the primitive type int
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");*/ 
		//Output :  Not Equal

	}

}
