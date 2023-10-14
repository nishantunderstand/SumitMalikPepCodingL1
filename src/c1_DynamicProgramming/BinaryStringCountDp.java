package c1_DynamicProgramming;

import java.util.Scanner;

public class BinaryStringCountDp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Binary String Count :");
		int n = sc.nextInt();
		int dp0[] = new int[n + 1];
		int dp1[] = new int[n + 1];
		dp0[0] = 0;
		dp1[0] = 0; // <- No need to Mention Explicit
		dp0[1] = 1;
		dp1[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp1[i] = dp1[i - 1] + dp0[i - 1];
			dp0[i] = dp1[i - 1];
		}
		System.out.println("Possible Combination Without Consecutive Zero :" + (dp0[n] + dp1[n]));
		sc.close();
	}

}

/*
 * 
 * for (int i = 0; i <= n; i++) { <-- Generate Error dp1[i] = dp1[i - 1] + dp0[i
 * - 1]; dp0[i] = dp1[i - 1]; }
 * 
 * for (int i = 1; i <= n; i++) { <-- Still Error dp1[i] = dp1[i - 1] + dp0[i -
 * 1]; dp0[i] = dp1[i - 1]; }
 * 
 * 
 */