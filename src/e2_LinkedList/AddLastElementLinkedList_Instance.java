package e2_LinkedList;

import java.util.Scanner;

public class AddLastElementLinkedList_Instance {

	public static class Node {
		int data;
		Node next;
	}

	public static class LinkedList {
		Node head; // Here Variable is Instance 
		Node tail;
		int size;

		public void addElement(LinkedList list, int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = null;

			if (list.size == 0) {
				head = temp;
				tail = temp;
			} else {
				tail.next = temp;
				tail = temp;
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
		System.out.println("Enter Your LinkedList");
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		list.addElement(list, 201);
		list.addElement(list, 30);
		list.addElement(list, 40);
		list.addElement(list, 50);
		list.display();
		sc.close();

	}
}