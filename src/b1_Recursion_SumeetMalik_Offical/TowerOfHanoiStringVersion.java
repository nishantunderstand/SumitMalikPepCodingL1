package b1_Recursion_SumeetMalik_Offical;

import java.util.Scanner;

public class TowerOfHanoiStringVersion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 3;
		String towerA = "A";
		String towerB = "B";
		String towerC = "C";
		toh(n, towerA, towerB, towerC);
		// n , Source , Destination, Helper
		scanner.close();
	}

	private static void toh(int n, String towerA, String towerB, String towerC) {
		// n , Source , Destination, Helper
		// n represent number of disks
		if (n == 0) {
			return;
		}
		toh(n - 1, towerA, towerC, towerB);
		System.out.println(n + "[" + towerA + "->" + towerB + "]");
		toh(n - 1, towerC, towerB, towerA);

	}

}
