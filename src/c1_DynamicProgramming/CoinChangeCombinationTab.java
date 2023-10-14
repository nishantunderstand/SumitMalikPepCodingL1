package c1_DynamicProgramming;

import java.util.Scanner;

public class CoinChangeCombinationTab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coin Change Combination");
		int n = sc.nextInt();
		int arr[] = new int[n]; // Types Of Coin 2,3,5
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int amt = sc.nextInt();
		int dp[] = new int[amt + 1];
		dp[0] = 1;
		for (int i = 0; i < arr.length - 1; i++) // Coin Loops
		{
			// 5 Ka Loops Makes no sense to Run From 1-4
			for (int j = arr[i]; j < dp.length; j++) // DP Loops
			{
				dp[j] += dp[j - arr[i]];
			}
		}
		System.out.println("Coin Change Combinations:" + dp[dp.length - 1]);
		sc.close();
	}
}
