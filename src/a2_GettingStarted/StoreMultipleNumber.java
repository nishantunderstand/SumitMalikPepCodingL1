package a2_GettingStarted;

import java.util.Scanner;

public class StoreMultipleNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Number you Want to Insert");
		int t = scanner.nextInt();
		for (int i = 1; i <= t; i++) {
			System.out.print("Enter Your " + i + " number:" + "\n");
			int num = scanner.nextInt();
			System.out.print("\n" + "Your Entered " + i + " number is :" + num + "\n");
		}

		scanner.close();
	}

}
