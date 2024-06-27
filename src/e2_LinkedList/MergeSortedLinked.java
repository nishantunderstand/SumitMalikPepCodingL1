
package e2_LinkedList;

public class MergeSortedLinked {

	/**
	 * Tortoise and Hare algorithm.
	 * Two Pointer
	 * Floyd’s Cycle Algorithm or Tortoise And Hare algorithm
	 */
	public static class Node {
		int data;
		Node next;
	}

	public static class LinkedList {
		Node head;
		Node tail;
		int size;

		public int size() {
			return size;
		}

		public void addLast(LinkedList list, int val) {
			/**
			 * <0 - Notify
			 * 0 - Head=Tail,Size++
			 * 1 - new Tail , next = null, size++
			 * >1 - Same as above
			 */

			Node newNode = new Node();
			newNode.data = val;
			newNode.next = null;

			if (list.size < 0) {
				System.out.println("List Size is 0");
			} else if (list.size == 0) {
				head = newNode;
				tail = newNode;
				size++;
			} else {
				tail.next = newNode; // Creating Connection with Existing Tail
				tail = newNode; // Updating the Tail
				size++;
			}

		}

		public void display(LinkedList list) {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data);
				System.out.print(" -> ");
				temp = temp.next;
			}
			System.out.println("null");
		}
/**
		public Node midNode(Node head, Node tail) {

			Node slow = head;
			Node fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			System.out.println("Mid of LinkedList :" + slow.data);
		}
		
		public LinkedList mergeSort(Node head, Node tail) {
			Node mid = midNode(head, tail);
			LinkedList fsh = mergeSort(head, mid);
			LinkedList ssh = mergeSort(mid.next, tail);
			// LinkedList fsh = mergeSort(mid.next, tail);
		}

	}
	*/

	public static void main(String[] args) throws Exception {
		LinkedList list = new LinkedList();
		list.addLast(list, 1);
		list.addLast(list, 2);
		list.addLast(list, 3);
		list.addLast(list, 4);
		list.addLast(list, 5);
		list.addLast(list, 6);
		list.display(list);


	}
}
}
