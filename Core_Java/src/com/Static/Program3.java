package com.Static;

public class Program3 {
	/*public double power(double base, int index) {
		double result =1;
		for(int count = 1; count<=index; ++count) 
			result = result * base;
		return result;
	}*/
	
	public static double power(double base, int index) {
		double result =1;
		for(int count = 1; count<=index; ++count) 
			result = result * base;
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Program3 p = new Program3();
		double result = p.power(2, 3);*/
		
		//double result = Program3.power(2, 3);
		double result = power(2, 3);
		System.out.println("Result : "+result);

	}

}
