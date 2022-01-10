package com.problem.linkedlist;

public class LinkedList {
	private int value;
	private LinkedList next;
	
	public LinkedList(int data,LinkedList nextNode){
		value = data;
		next = nextNode;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public LinkedList getNext() {
		return next;
	}

	public void setNext(LinkedList next) {
		this.next = next;
	}
	
	
}
