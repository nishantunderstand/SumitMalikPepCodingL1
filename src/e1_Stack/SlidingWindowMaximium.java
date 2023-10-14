package e1_Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SlidingWindowMaximium {
	public static void main(String[] args) {
		System.out.println("Sliding Window Maximium  :");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int k = scn.nextInt();
		System.out.println("Array :" + Arrays.toString(arr));
		System.out.println("Window Size:" + k);
		SlidingWindowMaximium(arr, k);
		scn.close();
	}

	private static void SlidingWindowMaximium(int[] arr, int k) {
		int nge[] = new int[arr.length];
		Stack<Integer> st = new Stack<>();

		st.push(arr.length - 1);
		nge[arr.length - 1] = arr.length;// Last Element

		for (int i = arr.length - 2; i >= 0; i--) {

			while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
				st.pop();
			}

			if (st.size() == 0) {
				nge[i] = arr.length;

			} else {
				nge[i] = st.peek();
			}

			st.push(i);
		}

		for (int i = 0; i < arr.length - k; i++) {
			/*
			 * int j = 0; if (j < i) { j = i; }
			 */

			int j = i;
			while (nge[j] < i + k) {
				j = nge[j];
			}
			System.out.println(arr[j]);

		}

	}

}
