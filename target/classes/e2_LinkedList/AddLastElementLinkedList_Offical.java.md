```java
package e2_LinkedList;

import java.util.Scanner;
/**
 * Question : Add to Linked List ?
 * So you need to consider the possibility ?
 * What if the size is Zero ?
 * Then how the things will work ?
 */
public class AddLastElementLinkedList_Offical {
	//Storage : 4 Byte + 4 Byte => Total 8 Byte
	public static class Node {
		int data;
		Node next;
	}

	// Can Static Class access Non-Static Member ?
	// Yes
	public static class LinkedList {
		Node head;
		Node tail;
		int size;

		public void addElement(int val) {

			// Common Code
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
			// Common Code
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
		list.addElement(20);
		list.addElement(30);
		list.addElement(40);
		list.addElement(50);
		list.display();
		sc.close();

	}
}
```