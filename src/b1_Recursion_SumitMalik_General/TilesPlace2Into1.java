package b1_Recursion_SumitMalik_General;

import java.util.Scanner;

public class TilesPlace2Into1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Tile Length :");
		int n = sc.nextInt();

		System.out.println("Enter Tile Breadth :");
		int m = sc.nextInt();

		System.out.println("Tiles n*m : " + n + "*" + m);
		int ways = TilesPlace2Into1(n, m);
		System.out.println("Tiles Possible Arrangments are :" + ways);
		sc.close();
	}

	private static int TilesPlace2Into1(int n, int m) {
		if (n == m) {
			return 2;
		}
		if (n < m) {
			return 1;
		}
		int horz = TilesPlace2Into1(n - 1, m);
		int vert = TilesPlace2Into1(n - m, m);
		return (horz + vert);
	}

}
