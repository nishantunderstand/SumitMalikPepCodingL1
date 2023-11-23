package a2_GettingStarted.PrimeNumber;

import java.util.Scanner;

public class CheckPrimeNumberGreaterthanOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Number :");
		int num = scanner.nextInt();

		boolean flag = true;
		for (int div = 2; div < num; div++) {
			if (num % div == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true && num >= 1) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}

		scanner.close();
	}

}
