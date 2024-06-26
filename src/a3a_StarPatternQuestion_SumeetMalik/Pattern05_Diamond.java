package a3a_StarPatternQuestion_SumeetMalik;
/**
                *
        *       *       *
*       *       *       *       *
        *       *       *
                *

*/
import java.util.Scanner;

public class Pattern05_Diamond {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = 5;
		DiamondPatternv1(n);

		sc.close();
	}

	private static void DiamondPatternv1(int n) {
		System.out.println("Diamond Shape");
		int sp = n / 2;
		int st = 1;
		for (int i = 1; i <= n; i++) {

			// for (int j = 1; j < sp; j++) <-- WRONG
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			// for (int j = 1; j < st; j++) <--WRONG
			for (int j = 1; j <= st; j++) {
				System.out.print("*" + "\t");
			}
			if (i <= n / 2) {
				sp--;
				st += 2;
			} else {
				sp++;
				st -= 2;
			}
			System.out.println();
		}
	}

}
