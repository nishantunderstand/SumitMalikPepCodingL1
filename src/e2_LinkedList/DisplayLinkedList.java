package e2_LinkedList;

import java.util.Scanner;

public class DisplayLinkedList {

	public static class Node {
		int data;
		Node next;
	}

	public static class LinkedList {
		Node head;
		Node tail;
		int size;

		void addLast(int val) {
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
		public int size(){
			/**
			This is wrong. As we have propety to disply it.
			LinkedList list = new LinkedList();
			System.out.println(list.size);
			return list.size;
			*/
			return size;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Your LinkedList");
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.display();
		System.out.println("List Size : "+list.size());
		sc.close();

	}
}