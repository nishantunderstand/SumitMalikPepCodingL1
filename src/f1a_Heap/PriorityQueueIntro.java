package f1a_Heap;

import java.util.PriorityQueue;

public class PriorityQueueIntro {
	public static void main(String[] args) throws Exception {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
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
