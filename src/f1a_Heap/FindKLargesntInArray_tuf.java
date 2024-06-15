package f1a_Heap;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
/**
 * Will Duplicate impact it ?
 */
public class FindKLargesntInArray_tuf {
	public static void main(String[] args) {
		int k=3;
		int[] arr ={3,2,1,5,6,4}; //5 
		// We can use Collection Framework Or Lambada 
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);		
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(Collections.reverseOrder());	
		for(int i:arr){
			pq.add(i++);
		}
		for(int i:arr){
			pq1.add(i++);
		}
		System.out.println("Lambda :"+pq);
		System.out.println("Collection Reverse Order :"+pq1);
	}

}
