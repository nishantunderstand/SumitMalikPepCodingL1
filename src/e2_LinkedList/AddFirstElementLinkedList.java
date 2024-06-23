package e2_LinkedList;

import java.util.Scanner;

public class AddFirstElementLinkedList {

	public static class Node {
		int data;
		Node next;
	}

	public static class LinkedList {
		Node head;
		Node tail;
		int size;

		void addElement(int val) {
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
			size++;
		}

		public void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + "-->");
				temp = temp.next;
			}
			System.out.println();
		}

		public void addFirstElement(LinkedList list, int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = head;
			head = temp;
			if (list.size == 0) {
				tail = temp; // More correct
				// head = tail; // This Implemtation is wrong, When the list is initially empty (i.e., size == 0), you set head to tail instead of setting tail to head.
				// tail=head; // Correct
			}
			size++;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		/**
		list.addElement(20);

		list.addElement(30);
		list.addElement(40);
		list.addElement(50);
		*/
		System.out.println("My LinkedList :");
		list.display();
		int val = 1210;
		System.out.println("\nValues Added :" + val);
		list.addFirstElement(list, val);
		System.out.println("My Updated LinkedList :");
		list.display();
		sc.close();

	}

}