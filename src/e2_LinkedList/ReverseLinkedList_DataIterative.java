package e2_LinkedList;

import java.util.Scanner;

public class ReverseLinkedList_DataIterative {

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

		public Node getNodeAt(int idx) {
			Node temp = head;
			for (int i = 0; i < idx; i++) {
				temp = temp.next;
			}
			return temp;
		}

		public void reverseDataIterative(LinkedList list) {
			int li = 0;
			int ri = list.size - 1;

			while (li < ri) {
				Node left = getNodeAt(li);
				Node right = getNodeAt(ri);
				int temp = left.data;
				left.data = right.data;
				right.data = temp;
				li++;
				ri--;
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

		System.out.println("My LinkedList size :" + list.size);
		System.out.println("My LinkedList :");
		list.display();
		list.reverseDataIterative(list);
		System.out.println("\nMy Updated LinkedList :");
		list.display();
		sc.close();

	}
}