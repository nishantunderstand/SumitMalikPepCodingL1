package e2_LinkedList;

public class Merge2SortedLinkedList_SummetMalik {
	public static class Node {
		int data;
		Node next;
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

	}

	public static void merge2sortedLinkedList(LinkedList list1, LinkedList list2) {

		Node one = list1.head; // I already point its head
		Node two = list2.head;

		LinkedList res = new LinkedList();
		
		while (one != null && two != null) {
			if (one.data < two.data) {
				res.addLast(one.data);

				one = one.next;
			}else {
				res.addLast(two.data);

				two = two.next;
			}

		}

		// one.next != null , This is Wrong
		while (one != null) {
			res.addLast(one.data);
			one = one.next;
		}

		while (two != null) {
			res.addLast(two.data);
			two = two.next;
		}

		res.display();
	}

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.addLast(10);
		list1.addLast(20);
		list1.addLast(30);
		list1.addLast(40);
		list1.addLast(50);
		list1.display();

		LinkedList list2 = new LinkedList();
		list2.addLast(9);
		list2.addLast(21);
		list2.addLast(24);
		list2.addLast(39);
		list2.addLast(50);
		list2.addLast(90);
		list2.addLast(150);
		list2.display();

		merge2sortedLinkedList(list1, list2);
	}

}



