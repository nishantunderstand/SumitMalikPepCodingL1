package b1_Recursion_SumeetMalik_Offical;

import java.util.Scanner;

public class NumberPowXnBetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int x = sc.nextInt();
		System.out.print("Enter the Power level you want to compute:");
		int n = sc.nextInt();
		int ans = PowXnMod(x, n);
		System.out.println("Power of " + x + " Raise to " + n + " = " + ans);
		sc.close();
	}

	private static int PowXnMod(int x, int n) {
		if (x == 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		return x * PowXnMod(x, n - 1);
	}

}
