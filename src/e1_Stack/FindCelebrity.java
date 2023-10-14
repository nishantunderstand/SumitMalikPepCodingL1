package e1_Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class FindCelebrity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Celebrity Problem:");
		int n = sc.nextInt();

		int arr[][] = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Arrays:" + Arrays.deepToString(arr));
		FindCelebrity(arr);
		sc.close();
	}

	private static void FindCelebrity(int[][] arr) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}
		while (st.size() >= 2) {
			int i = st.pop();
			int j = st.pop();

			if (arr[i][j] == 1) {
				// i know j => i => not celebrity,j => celebrity
				st.push(j);

			} else {
				// i don't know j => j => not celebrity, i => celebrity
				st.push(i);
			}
		}
		int pot = st.pop();
		for (int i = 0; i < arr.length; i++) {

		}

	}

}

/*
 * 4 0 0 0 0 1 0 1 1 1 1 0 1 1 1 1 0
 * 
 */
