package c1_DynamicProgramming;

import java.util.Scanner;

public class BinaryStringCountDpOldNewCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Binary String Count :");
		int n = sc.nextInt();
		int oczeros = 1;
		int ocones = 1;
		for (int i = 2; i <= n; i++) {
			int nczeros = ocones; // <--
			int ncones = oczeros + ocones;
			ocones = ncones;
			oczeros = nczeros;
		}
		System.out.println("Possible Combination Without Consecutive Zero :" + (ocones + oczeros));
		sc.close();
	}
}
