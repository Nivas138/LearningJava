package com.learn.java.nivas.datastructure;

public class LinkedListScratch {

	LinkedListNode head;
	
	public void add(int newData) {
		//LL Is Empty //LL IS Not Empty
		if(this.head == null) {
			this.head = new LinkedListNode(newData);
		}else {
			LinkedListNode newToAdd = new LinkedListNode(newData);
			newToAdd.next = this.head;
			this.head = newToAdd;
		}
		
	}
	
	public static void main(String[] args) {
		LinkedListScratch lls = new LinkedListScratch();
		lls.add(10);
		lls.add(5);
		System.out.println(lls.head);
	}
}
