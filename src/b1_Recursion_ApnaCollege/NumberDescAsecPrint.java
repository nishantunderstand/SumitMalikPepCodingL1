package b1_Recursion_ApnaCollege;

import java.util.Scanner;

public class NumberDescAsecPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = 7;
		PrintDescAsec(n);
		sc.close();
	}

	private static void PrintDescAsec(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PrintDescAsec(n - 1);
		System.out.println(n);

	}

}
