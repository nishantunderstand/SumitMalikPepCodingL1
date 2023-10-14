package c1_DynamicProgramming;

import java.util.Scanner;

public class CoinChangePermutationTab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coin Change Combination");

		int n = sc.nextInt();
		int coins[] = new int[n]; // Types Of Coin 2,3,5
		for (int i = 0; i < coins.length; i++) {
			coins[i] = sc.nextInt();
		}
		int tar = sc.nextInt();

		int dp[] = new int[tar + 1];
		dp[0] = 1;

		for (int amt = 1; amt <= tar; amt++) {
			for (int coin : coins) {
				if (coin <= amt) {
					int ramt = amt - coin;
					dp[amt] += dp[ramt];
				}
			}
		}
		System.out.println("Coin Change Permutations :" + dp[tar]);
		sc.close();
	}

}
