package c1_DynamicProgramming;

import java.util.Scanner;

public class TargetSumSubSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Target Sum Subset DP");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int tar = sc.nextInt();
		boolean[][] dp = new boolean[n + 1][tar + 1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				// First Index,First Column
				if (i == 0 && j == 0) {
					dp[i][j] = true;
				}
				// first Index
				else if (i == 0) {
					dp[i][j] = false;
				}
				// First Column
				if (j == 0) {
					dp[i][j] = true;
				}
				// Rest of the block
				else {
					// Don't Bat
					if (dp[i - 1][j] == true) {
						dp[i][j] = true;

					}
					// Bat
					else {
						// Relationship Between Array & Dp
						int val = arr[i - 1];
						// Condition's to bat
						if (j >= val) {
							if (dp[i - 1][j - val] == true) {
								dp[i][j] = true;
							}
						}
					}
				}
			}
		}
		System.out.println("Is there Possible Combination  ? " + dp[n][tar]);
		sc.close();
	}

}
