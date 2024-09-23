package com.Interface;
import java.util.Arrays;
import java.util.Scanner;

interface Collection {
	void acceptRecord();
	int[] toArray();
	void printRecord();
	
	static void swap( int[] arr ) {
		int temp = arr[ 0 ];
		arr[ 0 ] = arr[ 1 ];
		arr[ 1 ] = temp;
	}
	default void sort() {
		int[] arr = this.toArray();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int[] temp = new int[ ] { arr[j], arr[ j + 1 ] };
					Collection.swap(temp);
					arr[j] = temp[ 0 ];
					arr[ j + 1 ] = temp[ 1 ];
				}
			}
		}
	 }
}

class Array implements Collection {
	private int[] arr;
	
	public Array() {
		this(5);
	}
	public Array(int size) {
		this.arr = new int[size];
	}
	
	@Override
	public void acceptRecord() {
		try (Scanner sc = new Scanner(System.in)) {
			for (int index = 0; index < this.arr.length; ++index) {
				System.out.print("Enter element : ");
				this.arr[index] = sc.nextInt();
			}
		}
	}
	@Override
	public int[] toArray() {
		 return this.arr;
	}
	@Override
	public void sort() {
		for( int i = 0; i < this.arr.length - 1; ++ i ) {
			for( int j = i + 1; j < this.arr.length; ++ j ) {
				if( this.arr[ i ] > this.arr[ j ] ) {
					int[] temp = new int[ ] { arr[ i ], arr[ j ]};
					Collection.swap(temp);
					arr[ i ] = temp[ 0 ];
					arr[ j ] = temp[ 1 ];
				}
			}
		}
	 }
	 @Override
	 public void printRecord() {
		 System.out.println(Arrays.toString(this.arr));
	 }
}

public class DefaultMethood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new Array();
		c.acceptRecord();
		c.sort();
		c.printRecord();


	}

}
