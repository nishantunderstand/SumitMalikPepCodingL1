package a2_GettingStarted;

import java.util.Scanner;

public class GradingSystem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number:");
		int number = sc.nextInt();

		if (number >= 90) {
			System.out.println("excellent");
		} else if (number >= 80) {
			System.out.println("good");
		} else if (number >= 70) {
			System.out.println("fair");
		} else if (number >= 60) {
			System.out.println("expectations");
		} else {
			System.out.println("below par");
		}

		sc.close();

	}

}
