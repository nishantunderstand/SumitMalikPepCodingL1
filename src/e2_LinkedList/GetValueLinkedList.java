package e2_LinkedList;

import java.util.Scanner;
/** 
DS LinkedList 
Size 
<0 Invalid 
1,>1 Valid 
Input idx Valid 
Invalid <0, OutOfIndex
*/


public class GetValueLinkedList {
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
		}

		public int getFirst(LinkedList list) {
			if (list.size == 0) {
				System.out.println("List is Empty");
				return -1;
			} else {
				return head.data;
			}

		}

		public int getLast(LinkedList list) {
			if (list.size == 0) {
				System.out.println("List is Empty");
				return -1;
			} else {
				return tail.data;
			}
		}

		public int getAt(LinkedList list, int idx) {
			if (list.size == 0) {
				System.out.println("List is Empty");
				return -1;
			} else if (idx < 0 || idx >= size) {
				System.out.println("Invalid Arguements");
				return -1;
			} else {
				Node temp = head;
				for (int i = 0; i < idx; i++) {
					temp = temp.next;
				}
				return temp.data;
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		System.out.println("My LinkedList:");
		list.display();
		System.out.println();
		int firstelement = list.getFirst(list);
		System.out.println("First Element :" + firstelement);

		int lastelement = list.getLast(list);
		System.out.println("Last Element :" + lastelement);

		int idx = 3;
		int speificelement = list.getAt(list, idx);
		System.out.println("Specific Element at index is " + idx + " == " + speificelement);
		sc.close();

	}
}