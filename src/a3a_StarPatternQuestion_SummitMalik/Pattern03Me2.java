package a3a_StarPatternQuestion_SummitMalik;

import java.util.Scanner;

public class Pattern03Me2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		System.out.println("Your Star ");
		int sp = n - 1;
		int st = 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*" + "\t");
			}
			sp--;
			st++;
			System.out.println();

		}
		sc.close();
	}

}
