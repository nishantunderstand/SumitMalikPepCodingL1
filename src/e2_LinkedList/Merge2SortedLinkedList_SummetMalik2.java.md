```java
package e2_LinkedList;

public class Merge2SortedLinkedList_SummetMalik2 {
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
				// System.out.print("->");
				temp = temp.next;
			}
			System.out.println("null");
		}

		void addLast(int val) {

			Node temp = new Node();
			temp.data = val;
			temp.next = null;

			if (list.size() == 0) {
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
		/**
		 * Size Mismatch
		 */
		/**
		 * Not Required, As this is not an Array
		 * int i = 0;
		 * int j = 0;
		 * int k = 0;
		 * 
		 */
		Node one = list1.head;
		Node two = list2.head;

		// Node result = new Node(); // Why am i creating a Node, I need to create LinkedList
		// merged data,next
		LinkedList res = new LinkedList();
		
		while (one.next != null && two.next != null) {

			if (one.data < two.data) {
				res.addLast(one.data);
				// i++;
				one = one.next;
			}else {
				res.addLast(two.data);
				// j++;
				two = two.next;
			}
			// k++;
		}
		// How to Dump Remaining Data of LinkedList 1 & LinkedList2
		// We have to use while Loop
		while (one.next != null) {
			res.addLast(one.data);
			one = one.next;
		}

		while (two.next != null) {
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


/**


while (temp1.next != null && temp2.next != null) {

			if(temp1.data<temp2.data) {

				Node mergedNew = new Node();

				mergedNew.data = temp1.data;
				mergedNew.next = merged.next;

				i++;
				temp1= temp1.next;

			}else {
				Node mergedNew = new Node();

				mergedNew.data = temp2.data;
				mergedNew.next = merged.next;

				j++;
				temp2 =temp2.next;
			}
			k++;
		}
		// How to Dump Remaining Data of LinkedList 1 & LinkedList2
		if (temp1.next != null) {
			Node mergedNew = new Node();

			mergedNew.data = temp1.data;
			mergedNew.next = merged.next;
			temp1 = temp1.next;
		}

		if (temp2.next != null) {
			Node mergedNew = new Node();

			mergedNew.data = temp2.data;
			mergedNew.next = merged.next;
			temp2 = temp2.next;
		}



*/





















```