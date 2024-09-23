package com.Array;

public class Large_SmallLS {

	public static int getLargeSmall(int numbers[]) {
		int largest = Integer.MIN_VALUE; // -infinity
		int smallest=Integer.MAX_VALUE; // +infinity
		
		for(int i=0; i<numbers.length; i++) {
			if(largest<numbers[i])
				largest = numbers[i];
			if(smallest>numbers[i])
				smallest=numbers[i];
		}
		System.out.println("Smallest value is "+smallest);
		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {2,4,6,3,5};
		System.out.println("Largest value is "+getLargeSmall(numbers));

	}
}
