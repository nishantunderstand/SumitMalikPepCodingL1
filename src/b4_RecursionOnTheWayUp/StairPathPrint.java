package b4_RecursionOnTheWayUp;

import java.util.Scanner;

public class StairPathPrint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number :");
		int n = scanner.nextInt();

		System.out.println("Path From " + n + " are:");
		StairPathPrint(n, "");
		scanner.close();
	}

	private static void StairPathPrint(int n, String path) {
		if (n < 0) {
			return;
		}
		if (n == 0) {
			System.out.println(path);
			return;
		}

		StairPathPrint(n - 1, path + "1");
		StairPathPrint(n - 2, path + "2");
		StairPathPrint(n - 3, path + "3");

	}

}

/*
 * if (n < 0) { return; }
 * 
 * You need to handle Negative Cases as well, Otherwise Problem will get error
 * or incorrect Output
 * 
 */
