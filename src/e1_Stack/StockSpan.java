package e1_Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
	public static void main(String[] args) {
		System.out.println("Stock Span:");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Stock Span :" + Arrays.toString(arr));
		int[] ans = StockSpan(arr);
		System.out.println("Stock Span :" + Arrays.toString(ans));
		scn.close();
	}

	private static int[] StockSpan(int[] arr) {
		int span[] = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		span[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
				st.pop();
			}

			if (st.size() == 0) {
				span[i] = i + 1;
			} else {
				span[i] = i - st.peek();
			}

			st.push(i);
		}

		return span;
	}

}
