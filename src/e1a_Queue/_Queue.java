package e1a_Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class _Queue {
	public static void main(String[] args) {
		Queue<Integer> que = new ArrayDeque<>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		System.out.println("Queue : " + que);

	}

}
