package e2_LinkedList;

import java.util.Scanner;

public class LinkedListIntrocopy {
		public static class Node{
			int data;
			Node next;
		}
		public static class LinkedList{
			Node head;
			Node tail;
			int size;

			public void addElement(LinkedList list, int val)
			{
				Node temp = new Node();
				temp.data = val;
				temp.next=null;
				if(list.size==0){
					head = temp;
					tail = temp;
				}else{		
					tail.next = temp; // Link the current tail to the new node		
					tail = temp; // Update the tail to the new node
					// tail.next = temp;// Wrong Result. ?? What does this line Significance
				}
				size++;
			}
			public void display(){
				Node temp = head;
				while (temp!=null) {
					System.out.print(temp.data+"-->");					
					temp = temp.next;
				}
			}			
		}

		public static void main(String[] args){
			LinkedList list = new LinkedList();
			list.addElement(list, 2);
			list.addElement(list, 1);
			list.addElement(list, 2);
			list.addElement(list, 3);
			list.addElement(list, 4);
			System.out.println(list);
			System.out.println(list.size);
			list.display();
		}
	}

	
	
	