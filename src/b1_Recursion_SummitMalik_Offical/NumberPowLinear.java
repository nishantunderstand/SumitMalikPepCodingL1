package b1_Recursion_SummitMalik_Offical;

import java.util.Scanner;

public class NumberPowLinear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number Whom you want to calculate power :");
		int x = sc.nextInt();
		System.out.print("Upto to which Power : ");
		int n = sc.nextInt();
		int ans = PowerLinear(x, n);
		System.out.println("Power of " + x + " Raise to " + n + " = " + ans);

		sc.close();
	}

	private static int PowerLinear(int x, int n) {

		if (n == 0) {
			return 1;
		}
		if (x == 0) {
			return 1;
		}
		int powern1 = PowerLinear(x, n - 1);
		int powern = x * powern1;
		return powern;
	}

}
