package a2_GettingStarted;

import java.util.Scanner;

public class CheckPrimeByCountOptmize1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Number :");
		int num = scanner.nextInt();

		int fact = 0;
		for (int div = 1; div <= num; div++) {
			if (num % div == 0) {
				fact++;

			}
		}
		System.out.println("Total No of Factor : " + fact);
		if (fact == 2) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime | Composite Number");
		}

		scanner.close();
	}

}
