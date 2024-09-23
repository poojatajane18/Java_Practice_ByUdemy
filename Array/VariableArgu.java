package com.Array;

public class VariableArgu {
	private static void sum(int... argument) {
		int result = 0;
		for(int element : argument)
			result = result+element;
		System.out.println("Result : "+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArgu.sum();
		VariableArgu.sum(10,20,30);
		VariableArgu.sum(1,2,3,4,5,6,7,8);
		VariableArgu.sum(10,20,30,40,50,60,70,80,90,100,110,120);

	}

}
