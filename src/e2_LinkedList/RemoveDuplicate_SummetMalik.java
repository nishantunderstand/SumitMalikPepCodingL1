package e2_LinkedList;

import java.util.LinkedList;

public class RemoveDuplicate_SummetMalik {
    public static class Node {
        int data;
        Node next;

        Node(){            
        }
        Node(int data){
            this.data = data;
        }
        Node(int data,Node next){
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public int size() {
            return size;
        }

        public void addLast(int val) {
            /** 
            Node newNode = new Node();
            newNode.data = val;
            */
            Node newNode = new Node(val);
            
            if (size == 0) {
                head = newNode;
                tail = newNode;
                size++;
            } else {
                tail.next = newNode;
                tail = newNode;
                size++;
            }
        }

        public void addLast1(int val) {
            Node newNode = new Node();
            newNode.data = val;
            if (head == null) {
                head = newNode;
                tail = newNode;
                size++;
            } else {
                tail.next = newNode;
                tail = newNode;
                size++;
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList org = new LinkedList();
        org.addLast(10);
        org.addLast(10);
        org.addLast(20);
        org.addLast(20);
        org.addLast(30);
        org.addLast(40);
        org.display();

    }
}
