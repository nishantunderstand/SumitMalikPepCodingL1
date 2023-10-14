package c1_DynamicProgramming;

import java.util.Scanner;

public class StairClimbMinMovesTab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Stair Climb With Min Number of Moves :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Integer dp[] = new Integer[n + 1];
		// Integer dp[] = new Integer(n+1); <- Wrong
		dp[n] = 0;
		for (int i = n - 1; i >= 0; i--) {
			// arr[i] = 0 <-- No Jump Case
			if (arr[i] > 0) {
				int min = Integer.MAX_VALUE;
				// Jump Value & Not Out Of Array
				for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
					if (dp[i + j] != null) {
						min = Math.min(min, dp[i + j]); // Minimum in all moves
					}
				}
				if (min != Integer.MAX_VALUE) {
					dp[i] = min + 1; // Self Jump
				}
			}
		}
		System.out.println("Minimium Number of Moves :" + dp[0]);
		sc.close();
	}
}
