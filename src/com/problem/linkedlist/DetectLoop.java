package com.problem.linkedlist;

public class DetectLoop {

	public static void main(String args[]){
		LinkedList value5 = new LinkedList(5, null);
		LinkedList value4 = new LinkedList(4, value5);
		LinkedList value3 = new LinkedList(3, value4);
		LinkedList value2 = new LinkedList(2, value3);
		LinkedList head = new LinkedList(1, value2);
		//value5.setNext(head);
		 
		LinkedList single = head;
		LinkedList doublep = head;
		boolean haveLoop = false;
		while(single!=null && doublep!=null && doublep.getNext()!=null){
			single = single.getNext();
			doublep = doublep.getNext().getNext();
			if(single==doublep){
				haveLoop=true;
				break;
			}
		}
		System.out.print(haveLoop);
		
		
	}
}
