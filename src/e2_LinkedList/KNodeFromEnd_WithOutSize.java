package e2_LinkedList;

public class KNodeFromEnd_WithOutSize {

    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;    

        public int size(){
            return size;
        }    

        public void addLast(LinkedList list,int val){
            /**
            <0 - Notify 
            0 - Head=Tail,Size++
            1 - new Tail , next = null, size++
            >1  - Same as above
            */

            Node newNode = new Node();
            newNode.data = val;
            newNode.next = null;

            if(list.size<0){
                System.out.println("List Size is 0");
            }
            else if (list.size==0){
                head = newNode;
                tail = newNode;
                size++;
            }else{
                tail.next = newNode; // Creating Connection with Existing Tail
                tail = newNode; // Updating the Tail
                size++;
            }
            
        }
        
        public void display(LinkedList list){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data);
                System.out.print(" -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        
        public void kthNodeFromLast_WithOutLoop(LinkedList list,int idx) throws Exception{
            /** idx 
            <0 Error
            0 
            1
            >1 
                size <
                size > Error
            
            LinkedList list 
            size 
            <0 Error
            0 Error
            1 
            >1
            Advise : Never Try to do more than one things in a for Loops.
            You need to find the result than proceed further.
            */

            if (idx < 0 || idx > list.size || list.size < 0) {
                throw new Exception("Invalid Input");
            }
            
			Node slow = head;
			Node fast = head;
			int gap = idx;
			for (int i = 0; i < gap; i++) {
				fast = fast.next;
			}

			while (fast != null) {
				fast = fast.next;
				slow = slow.next;
			}
			System.out.println("Your Index is : " + slow.data);
        }
    }

   
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        list.addLast(list, 1);
        list.addLast(list, 2);
        list.addLast(list, 3);
        list.addLast(list, 4);
        list.addLast(list, 5);
        list.display(list);
		int idx = 3;
        System.out.println("Index From End :"+idx);
		list.kthNodeFromLast_WithOutLoop(list, idx);
    } 
}
