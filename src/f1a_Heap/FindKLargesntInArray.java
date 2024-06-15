package f1a_Heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
/**
 * Will Duplicate impact it ?
 */
public class FindKLargesntInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=2;
		int[] arr ={3,2,1,5,6,4}; //5 
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();		
		for (int i = 0; i < arr.length; i++) {
			if (i < k) {
				pq.add(arr[i]);	
			} else {
				if (arr[i] > pq.peek()) {
					pq.remove();
					pq.add(arr[i]);					
				}
			}			
		}
		System.out.println(pq.peek());
		sc.close();	

	}

}
