package a2_GettingStarted;

import java.util.Scanner;

public class InputStringInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Number:");
		int num = scanner.nextInt();
		String str = scanner.nextLine();
		System.out.println("Enter Your String:");
		System.out.println(num);
		System.out.println(str);

		scanner.close();
	}
}
