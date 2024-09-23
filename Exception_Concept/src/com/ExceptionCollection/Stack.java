package com.ExceptionCollection;

import com.Exception.StackOverFlowException;
import com.Exception.StackUnderFlowException;

public class Stack {
	private int top = -1;
	private int[]arr ;
	
	public Stack() {
		this(5);
	}
	public Stack(int size) {
		this.arr = new int[size];
	}
	
	public boolean empty() {
		return this.top == -1;
	}
	
	public boolean full() {
		return this.top == this.arr.length - 1;
	}
	
	public void push(int element) throws StackOverFlowException { //Custome exception class
		if(this.full())
			throw new StackOverFlowException("Stack is full");
		this.top = this.top + 1;
		this.arr[this.top] = element;
	}
	public int peek() throws StackUnderFlowException {
		if(this.empty())
			throw new StackUnderFlowException("Stack is empty");
		return this.arr[this.top];
	}
	public void pop() throws StackUnderFlowException {
		if(this.empty())
			throw new StackUnderFlowException("Stack is empty");
		this.top = this.top - 1;
	}
}
