package f1a_Heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueIntro {
	public static void main(String[] args) throws Exception {
		/** 
		low priority is given high significance
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		How to give High Value Priority ?
		Collections.reverseOrder()
		Is it Collection Or Collections ?
		*/
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int[] ranks = { 22, 99, 3, 11, 88, 4, 1 };
		for (int val : ranks) {
			pq.add(val);
		}

		while (pq.size() != 0) {
			System.out.println(pq.peek());
			pq.remove();
		}
	}
}
