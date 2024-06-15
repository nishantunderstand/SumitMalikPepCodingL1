package f1a_Heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KSortedArray {
	public static void main(String[] args) {
		int arr[] = {6, 5, 3, 2, 8, 10, 9};
		int k = 3;
		//Output: arr[] = {2, 3, 5, 6, 8, 9, 10}

		int[] arr1 = {2,3,1,4,6,7,5,8,9};
		int k1 = 2;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0;i<=k;i++){
			pq.add(arr[i]);
		}

		for(int i=k+1;i<arr.length;i++){
			System.out.print(pq.remove()+",");
			pq.add(arr[i]);
		}

		while(pq.size()!=0){
			System.out.print(pq.remove()+",");
		}


	}

}
