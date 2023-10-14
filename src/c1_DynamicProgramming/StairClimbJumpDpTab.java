package c1_DynamicProgramming;

import java.util.Scanner;

public class StairClimbJumpDpTab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Stair Climb With Jump Tab:");

		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int dp[] = new int[n + 1];
		// Last Index of Dp 6-6 1 Path Only
		dp[n] = 1;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
				dp[i] += dp[i + j];
			}
		}
		System.out.println("Possible No of Paths: " + dp[0]);
		sc.close();
	}

}
