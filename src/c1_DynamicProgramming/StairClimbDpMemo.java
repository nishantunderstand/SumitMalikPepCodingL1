package c1_DynamicProgramming;

import java.util.Scanner;

public class StairClimbDpMemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");

		int n = sc.nextInt();
		int cp = StairClimbDp(n, new int[n + 1]);

		System.out.println("Stair Path Combination :" + cp);
		sc.close();
	}

	private static int StairClimbDp(int n, int[] qb) {
		if (n == 0) {
			return 1;
		} else if (n < 0) {
			return 0;
		}
		if (qb[n] > 0) {
			return qb[n];
		}
		System.out.println("Hello :" + n);
		int nm1 = StairClimbDp(n - 1, qb);
		int nm2 = StairClimbDp(n - 2, qb);
		int nm3 = StairClimbDp(n - 3, qb);
		int nm = nm1 + nm2 + nm3;
		qb[n] = nm;
		return nm;
	}
}

/*
 * if (n == 0) { return 1; } else { <-- Wrong code return 0; }
 * 
 * 
 */