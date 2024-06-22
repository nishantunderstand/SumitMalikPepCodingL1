package b1_Recursion_SumeetMalik_Offical;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number of Towers :");
		int n = 3;
		System.out.println("Enter the Values For Tower 1,2,3 :");
		int t1d = 10;
		int t2d = 11;
		int t3d = 12;
		toh(n, t1d, t2d, t3d);
		// n , Source , Destination, Helper
		scanner.close();

	}

	private static void toh(int n, int t1d, int t2d, int t3d) {
		// n , Source , Destination, Helper
		// n represent number of disks

		if (n == 0) {
			return;
		}

		toh(n - 1, t1d, t3d, t2d);
		System.out.println(n + "[" + t1d + "->" + t2d + "]");
		toh(n - 1, t3d, t2d, t1d);

	}

}
