package c1_DynamicProgramming;

import java.util.Scanner;

public class KnapsackUnboundedByDp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unbounded Knapsack:");
		int n = sc.nextInt();
		int vals[] = new int[n];
		int wts[] = new int[n];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = sc.nextInt();
		}
		for (int i = 0; i < wts.length; i++) {
			wts[i] = sc.nextInt();
		}
		int cap = sc.nextInt();
		int dp[] = new int[cap + 1];
		dp[0] = 0;
		for (int bagc = 1; bagc <= cap; bagc++) {
			for (int i = 0; i < n; i++) {
				if (wts[i] <= bagc) {
					int rbagc = bagc - wts[i];

				}
			}
		}

		sc.close();
	}

}
