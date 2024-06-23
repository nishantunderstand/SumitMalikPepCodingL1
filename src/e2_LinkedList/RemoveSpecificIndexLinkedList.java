package e2_LinkedList;

import java.util.Scanner;

public class RemoveSpecificIndexLinkedList {

	public static class Node {
		int data;
		Node next;
	}

	public static class LinkedList {
		Node head;
		Node tail;
		int size;
	
		void addElement(LinkedList list, int val) {
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

		public void removeFirst(LinkedList list) {
			if (list.size == 0) {
				System.out.println("List is Empty");
			} else if (list.size == 1) {
				head = null;
				tail = null;
				size = 0;
			} else {
				head = head.next;
				size--;
			}

		}

		public void removeLast(LinkedList list) {
			if (list.size == 0) {
				System.out.println("List is Empty");
			} else if (list.size == 1) {
				head = null;
				tail = null;
				size = 0;
			} else {
				Node temp = head;
				for (int i = 0; i < list.size - 2; i++) {
					temp = temp.next;
					// Goal is to identify your Required Node.
				}
				tail = temp;
				temp.next = null;
				size--;
			}
		}

		public void removeSpecificIndex(LinkedList list, int idx) {
			if (idx < 0 || idx > list.size) {
				System.out.println("Invalid Arguments");
			} else if (idx == 0) {
				removeFirst(list);
			} else if (idx == list.size - 1) {
				removeLast(list);
			} else {
				// Traverse
				Node temp = head;
				for (int i = 0; i < idx; i++) {
					temp = temp.next;
				}
				temp.next = temp.next.next;				
				size--; // Size Decrease
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
		int idx = 2;
		System.out.println("\nRemove idx From LinkedList :" + idx);
		list.removeSpecificIndex(list, idx);
		System.out.println("My LinkedList:");
		list.display();
		sc.close();

	}
}