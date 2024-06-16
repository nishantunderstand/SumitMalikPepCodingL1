package e2_LinkedList;

import java.util.Scanner;

public class LinkedListIntro {

	public static class Node {
		int data;
		Node next;
	}

	public static class LinkedList {
		Node head;
		Node tail;
		int size;

/**
There are two cases which need to be handled:

1. If the linked list is empty, i.e. the size of the linked list is 0.
2. If there is at least one node already present in the linked list, i.e. 
	the size of the linked list is greater than or equal to 1.
	Both Case : You need to increase Size
*/
		void addElement(LinkedList list, int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = null;

			if (list.size == 0)  // Size Zero Case
			{
				head = temp;
				tail = temp;
			} else // Size Non-Zero Case
			{				
				tail = temp; // We can fetch value from temp.data, As we already put the data in temp. Look Above.
				tail.next = temp;
			}
			size++;
		}

		public void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + "-->");
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		list.addElement(list, 20);
		list.addElement(list, 30);
		list.addElement(list, 40);
		list.addElement(list, 50);
		System.out.println("My LinkedList size : " + list.size);
		System.out.println("My LinkedList : ");
		list.display();
		System.out.println("\nMy Updated LinkedList : ");
		list.display();
		sc.close();
	}
}