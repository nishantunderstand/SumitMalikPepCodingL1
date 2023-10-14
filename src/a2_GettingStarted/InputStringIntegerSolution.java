package a2_GettingStarted;

import java.util.Scanner;

public class InputStringIntegerSolution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Number:");
		int num = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter Your String:");
		String str = scanner.nextLine();

		System.out.println(num);
		System.out.println(str);

		scanner.close();
	}
}
