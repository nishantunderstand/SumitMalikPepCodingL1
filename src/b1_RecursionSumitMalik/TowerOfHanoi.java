package b1_RecursionSumitMalik;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number of Towers :");
		int n = scanner.nextInt();
		System.out.println("Enter the Values For Tower 1,2,3 :");
		int t1d = scanner.nextInt();
		int t2d = scanner.nextInt();
		int t3d = scanner.nextInt();
		toh(n, t1d, t2d, t3d);
		// n , Source , Destination, Helper
		scanner.close();

	}

	private static void toh(int n, int t1d, int t2d, int t3d) {
		// n , Source , Destination, Helper
		if (n == 0) {
			return;
		}
		toh(n - 1, t1d, t3d, t2d);
		System.out.println(n + "[" + t1d + "->" + t2d + "]");
		toh(n - 1, t3d, t2d, t1d);
	}

}
