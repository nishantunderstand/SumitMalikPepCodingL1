package c1_DynamicProgramming;

import java.util.Scanner;

public class StairClimbDp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();
		int cp = StairClimbDp(n);
		System.out.println("Stair Path Combination :" + cp);
		sc.close();
	}

	private static int StairClimbDp(int n) {
		if (n == 0) {
			return 1;
		} else if (n < 0) {
			return 0;
		}
		System.out.println("Hello :" + n);
		int nm1 = StairClimbDp(n - 1);
		int nm2 = StairClimbDp(n - 2);
		int nm3 = StairClimbDp(n - 3);
		int nm = nm1 + nm2 + nm3;
		return nm;
	}

}

/*
 * if (n == 0) { return 1; } else { <-- Wrong code return 0; }
 * 
 * 
 */