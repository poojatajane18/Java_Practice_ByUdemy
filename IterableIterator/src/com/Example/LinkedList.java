package com.Example;

import java.util.Iterator;

public class LinkedList implements Iterable<Integer>{
	private Node head = null;
	private Node tail = null;
	
	public boolean empty() {
		return this.head == null;
	}
	
	public void addLast(int element) {
		Node newNode = new Node(element);
		if(this.empty())
			this.head = newNode;
		else
			this.tail.next = newNode;
		this.tail = newNode;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		Iterator<Integer> itr = new LinkedListIterator(this.head); //Upcasting
		return itr;
	}
	
}
