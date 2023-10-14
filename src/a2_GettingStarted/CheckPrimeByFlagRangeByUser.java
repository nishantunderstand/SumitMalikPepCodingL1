package a2_GettingStarted;

import java.util.Scanner;

public class CheckPrimeByFlagRangeByUser {

	public static void main(String[] args) {
		System.out.println("Prime Number Checking by Range:");
		// boolean flag = true; <-- Incorrect Position

		Scanner scanner = new Scanner(System.in);
		System.out.println("Low Range");
		int lowRange = scanner.nextInt();
		System.out.println("High Range");

		int highRange = scanner.nextInt();

		if (lowRange > highRange) {
			System.out.println("Provide Valid Range!!" + lowRange + " ---> " + highRange);
		}

		for (int num = lowRange; num < highRange; num++) {
			boolean flag = true;
			// for (int i = 2; i * i < num; i++) // Tough To Understand, Look Better
			// for (int i = 2; i < (int) Math.sqrt(num); i++) I Understand this one better

			for (int i = 2; i * i < num; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(num + " is Prime ");
			} else {
				System.out.println(num + " is not Prime ");
			}
		}

	}

}
