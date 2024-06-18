package a3b_StarPatternQuestion_JavaTpoint;

import java.util.Scanner;

public class Pattern03Me4ReOrderSpSt {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		System.out.println("Your Star ");
		int sp = n - 1;
		int st = 1;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < st; j++) {
				System.out.print("*" + "\t");
			}
			for (int j = 0; j < sp; j++) {
				System.out.print("\t");
			}
			
			sp--;
			st++;
			System.out.println();

		}
		sc.close();
	}

}
