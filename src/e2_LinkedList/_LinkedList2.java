package e2_LinkedList;

import java.util.Scanner;

public class _LinkedList2 {

	public static class Node {
		int data;
		Node next;
	}

	public static class LinkedList {
		static Node head;
		static Node tail;
		static int size;

	}

	public static void display(LinkedList list) {
		Node temp = list.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
	}

	public static void addElement(LinkedList list, int val) {
		Node temp = new Node();
		temp.data = val;
		temp.next = null;

		if (list.size == 0) {
			list.head = temp;
			list.tail = temp;
		} else {
			list.tail.next = temp;
			list.tail = temp;
		}
		list.size++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		addElement(list, 20);
		addElement(list, 30);
		addElement(list, 40);
		addElement(list, 50);

		System.out.println("My LinkedList size : " + list.size);
		System.out.println("My LinkedList : ");
		display(list);
		System.out.println("\nMy Updated LinkedList : ");
		display(list);
		sc.close();

	}
}