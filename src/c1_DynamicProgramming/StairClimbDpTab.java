package c1_DynamicProgramming;

import java.util.Scanner;

public class StairClimbDpTab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();
		int cp = StairClimbDpTab(n);
		System.out.println("Stair Path Combination :" + cp);
		sc.close();
	}

	private static int StairClimbDpTab(int n) {
		int dp[] = new int[n + 1];

		dp[0] = 1;
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				dp[i] = dp[i - 1];
			} else if (i == 2) {
				dp[i] = dp[i - 1] + dp[i - 2];
			} else {
				dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
			}
		}
		return dp[n];
	}

}

/*
 * if (n == 0) { return 1; } else { <-- Wrong code return 0; }
 * 
 * Careful for loop i=1, i<= n
 */