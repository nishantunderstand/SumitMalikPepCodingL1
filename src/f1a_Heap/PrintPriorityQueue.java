package f1a_Heap;

import java.util.PriorityQueue;

public class PrintPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(12);
		pq.add(99);
		pq.add(33);
		pq.add(55);
		pq.add(1);
		System.out.println(pq);
		while (pq.size() > 0) {
			System.out.println(pq.peek());
			pq.remove();

		}

	}

}
