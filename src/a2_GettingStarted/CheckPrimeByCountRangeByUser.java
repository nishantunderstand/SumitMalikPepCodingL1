package a2_GettingStarted;

import java.util.Scanner;

public class CheckPrimeByCountRangeByUser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Min Range :");
		int min = scanner.nextInt();
		System.out.println("Enter Your Max Range :");
		int max = scanner.nextInt();

		if (min < max) {
			for (int num = min; num <= max; num++) {
				int fact = 0;
				for (int div = 1; div <= num; div++) {
					if (num % div == 0) {
						fact++;
					}
				}
				// System.out.println("Total No of Factor : " + fact);
				if (fact == 2) {
					System.out.println(num + " is prime");
				} else {
					System.out.println(num + " is not prime");
				}

			}
		} else {
			System.out.println("Provide Valid Min & Max " + min + " & " + max);
		}

		scanner.close();
	}

}
