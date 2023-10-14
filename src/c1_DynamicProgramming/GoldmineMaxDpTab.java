package c1_DynamicProgramming;

import java.util.Scanner;

public class GoldmineMaxDpTab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Goldmine");

		int n = sc.nextInt();
		int m = sc.nextInt();

		int arr[][] = new int[n][m];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int[][] dp = new int[n][m];

		for (int j = dp[0].length - 1; j >= 0; j--) {
			for (int i = dp.length - 1; i >= 0; i--) {
				// last column
				if (j == dp[0].length - 1) {
					dp[i][j] = arr[i][j];
				}
				// first row
				else if (i == 0) {
					dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j + 1]) + arr[i][j];

				}
				// last row
				else if (i == dp.length - 1) {
					dp[i][j] = Math.max(dp[i][j + 1], dp[i - 1][j + 1]) + arr[i][j];
				}
				// Rest
				else {
					dp[i][j] = Math.max(dp[i + 1][j + 1], Math.max(dp[i - 1][j + 1], dp[i][j + 1])) + arr[i][j];

				}
			}
		}
		int max = dp[0][0];
		for (int i = 1; i < dp.length; i++) {
			if (dp[i][0] > max)
				max = dp[i][0];
		}

		System.out.println("Maximium Gold :" + max);
		sc.close();
	}

}
