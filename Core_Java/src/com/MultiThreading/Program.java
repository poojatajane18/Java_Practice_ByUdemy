package com.MultiThreading;
import java.lang.Thread.State;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State[] states = State.values();
		 for (State state : states) {
		 System.out.printf("%-15s%-5d\n", state.name(),
		state.ordinal());
		 }

	}

}
