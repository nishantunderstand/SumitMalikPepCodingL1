package f1a_Heap;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindKLargesntInArray_tuf_leetCode {
	public static void main(String[] args) {
		int k=2;
		int[] arr ={3,2,1,5,6,4}; //5 
		// We can use Collection Framework Or Lambada 
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);		
		//PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());	
		for(int i:arr){
			pq.add(i++);
		}
		System.out.println("Priority Queue "+pq);
		int f = k-1;
		while(f!=0){
			pq.remove();
			f--;
		}
		System.out.println(pq.peek());
	}

}
