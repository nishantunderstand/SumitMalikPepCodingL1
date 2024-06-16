```java
package e2_LinkedList;

import java.util.Scanner;

// IDK , Whether it is correct or not. This is not the way of declaration.

public class AddLastElementLinkedList_Static {

	public static class Node {
		int data;
		Node next;
	}

	public static class LinkedList {
		static Node head; // Here Variable is Statice
		static Node tail;
		static int size;

		public static void addElement(int val) {
			// If you declare this method static , 
			// then you need to make the variable Static, 
			// otherwise there will be error. 
			// Got it ?
			
			// Common Code
			Node temp = new Node();
			temp.data = val;
			temp.next = null;

			if (size == 0) {
				head = temp;
				tail = temp;
			} else {
				tail.next = temp;
				tail = temp;
			}
			// Common Code
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
		System.out.println("Enter Your LinkedList");
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		list.addElement(203);
		list.addElement(30);
		list.addElement(40);
		list.addElement(50);
		list.display();
		sc.close();

	}
}

```