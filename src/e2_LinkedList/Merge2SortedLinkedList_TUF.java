package e2_LinkedList;

public class Merge2SortedLinkedList_TUF {

	/**
	 * For Printing a LinkedList,
	 * What we need is Head
	 * I need to understand the concept of Dummy Node.
	 */

	public static class Node {
		int data;
		Node next;

		Node() {
		}
		Node(int data) {
			this.data = data;
			this.next = null;
		}
		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public static class LinkedList {
		Node head;
		Node tail;
		int size;

		int size() {
			return size;
		}

		void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println("null");
		}

		void addLast(int val) {
			Node temp = new Node(val);

			if (size == 0) {
				head = temp;
				tail = temp;
			} else {
				tail.next = temp;
				tail = temp;
			}
			size++;
		}
	}

	public static Node sortTwoLinkedLists(Node list1, Node list2) {

		Node dummyNode = new Node(-1);
		Node temp = dummyNode;

		while (list1 != null && list2 != null) {

			if (list1.data <= list2.data) {
				temp.next = list1;
				list1 = list1.next;
			} else {
				temp.next = list2;
				list2 = list2.next;
			}
			temp = temp.next;
		}

		if (list1 != null) {
			temp.next = list1;
		} else {
			temp.next = list2;
		}

		System.out.println("Dummy Node :");
		printLinkedList(dummyNode);
		return dummyNode.next;
	}

	// This is really better way of Representing
	static void printLinkedList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.addLast(10);
		list1.addLast(20);
		list1.addLast(30);
		list1.addLast(40);
		list1.addLast(50);
		// list1.display();
		printLinkedList(list1.head);

		LinkedList list2 = new LinkedList();
		list2.addLast(9);
		list2.addLast(21);
		list2.addLast(24);
		list2.addLast(39);
		list2.addLast(50);
		list2.addLast(90);
		list2.addLast(150);
		// list2.display();
		printLinkedList(list2.head);

		Node mergedList = sortTwoLinkedLists(list1.head, list2.head);
		System.out.print("Merged sorted linked list: ");
		printLinkedList(mergedList);
	}
}
