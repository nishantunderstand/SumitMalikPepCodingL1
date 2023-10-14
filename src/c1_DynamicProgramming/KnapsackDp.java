package c1_DynamicProgramming;

import java.util.Scanner;

public class KnapsackDp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0-1 Knapsack:");
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
		int dp[][] = new int[n + 1][cap + 1];
		for (int i = 1; i < dp.length; i++) { // Item - Ball & Weight
			for (int j = 1; j < dp[0].length; j++) { // Capacity
				if (j >= wts[i - 1]) {
					int rcap = j - wts[i - 1];
					if (dp[i - 1][rcap] + vals[i - 1] > dp[i - 1][j]) {
						dp[i][j] = dp[i - 1][rcap] + vals[i - 1];
					} else {
						dp[i][j] = dp[i - 1][j];
					}
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		System.out.println("Maximum Weight :" + dp[n][cap]);
		sc.close();
	}

}
