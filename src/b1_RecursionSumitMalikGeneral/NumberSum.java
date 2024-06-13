package b1_RecursionSumitMalikGeneral;

import java.util.Scanner;

public class NumberSum {
	public static void main(String[] args) {
		System.out.println("Enter Number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printsum(0, n, 0);
		sc.close();
	}

	private static void printsum(int idx, int n, int sum) {
		if (idx == n) {

			System.out.println("sum " + (n + sum));
			return;
		}

		sum = sum + idx;
		printsum(idx + 1, n, sum);
	}

}
