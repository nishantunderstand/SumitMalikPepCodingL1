package a3b_StarPatternQuestion_Javatpoint;

import java.util.Scanner;

public class Pattern03Me3StartFromZero {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		System.out.println("Your Star ");
		
		for (int i = 0; i < n; i++) {

			int sp = n - 1;
			int st = 1;
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
