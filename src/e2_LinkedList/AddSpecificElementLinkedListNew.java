package e2_LinkedList;

import java.util.Scanner;
/** 
DS LinkedList size 
<0 Invalid Input
=0 head tail temp
>0 
User Input idx
<0 Invalid Input
=0 addFirst
>0
=size addLast
>size IndexOutofBound
*/

public class AddSpecificElementLinkedListNew {
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

		public void addFirstElement(LinkedList list, int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = head;
			head = temp;

			if (list.size == 0) {
				tail = temp;
			}
			size++;
		}

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

		public void addSpecificElement(LinkedList list, int val, int idx) {
			if (idx < 0 || idx > list.size) {
				System.out.println("Invalid Argument");
			} else if (idx == 0) {
				System.out.println("idx==0");
				addFirstElement(list, val);
			} else if (idx == list.size) {
				System.out.println("idx==list.size");
				addElement(list, val);
			} else {
				Node newNode = new Node();
				newNode.data = val;
				//newNode.next =???				
				// Traverse 
				Node temp = head;
				for(int i=0;i<idx-1;i++){
					temp = temp.next;
				}
				newNode.next = temp.next; // Instablishing the pair
				temp.next = newNode; // Deleting the Old Linked Pair
				size++;
			}
		}
		/** 
		public static int size(){			
			return list.size;
		}
		*/
		public int size(){
			return size;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		list.addElement(list, 20);
		list.addElement(list, 30);
		list.addElement(list, 40);
		list.addElement(list, 50);
		int val = 3333;
		int idx = 1;

		System.out.println("My LinkedList :");
		list.display();
		System.out.println("My LinkedList Size :"+list.size());
		System.out.println("Val :" + val + " && idx :" + idx);
		list.addSpecificElement(list, val, idx);
		System.out.println("My Updated LinkedList :");		
		list.display();
		System.out.println("My LinkedList Size :"+list.size());
		sc.close();

	}

}