package a3a_StarPatternQuestion_SummitMalik;

import java.util.Scanner;

public class Pattern02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		System.out.println("Your Star ");
		for (int i = 1; i < n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*" + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
