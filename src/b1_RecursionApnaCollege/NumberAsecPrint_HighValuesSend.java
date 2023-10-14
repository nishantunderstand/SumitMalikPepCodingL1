package b1_RecursionApnaCollege;

import java.util.Scanner;

public class NumberAsecPrint_HighValuesSend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		// Print 1-5
		// int n = sc.nextInt();
		int n = 1;
		PrintAsec(n);
		sc.close();
	}

	private static void PrintAsec(int n) {

		if (n > 5) {
			return;
		}

		System.out.println(n);
		PrintAsec(n + 1);
	}

}

/*
 * I want to print upto 10. How this can be resolved ?? Where are you providing
 * in code that you want to code upto 10 n==6 , Program will return from 6 6
 * Will not come in output n>5 , It will print upto 5, 5 will come in output n>5
 * ||n==6 SAME OUTPUT
 */