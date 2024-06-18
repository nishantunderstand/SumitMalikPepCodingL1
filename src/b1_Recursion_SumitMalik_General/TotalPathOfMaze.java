package b1_Recursion_SumitMalik_General;

import java.util.Scanner;

public class TotalPathOfMaze {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Maze x-index: ");
		int n = sc.nextInt();
		System.out.println("Maze y-index: ");
		int m = sc.nextInt();
		System.out.println("Your Entered Destination in Maze : " + "x : " + n + " y :" + m);
		int countPath = TotalPathOfMaze(0, 0, n, m);
		System.out.println("Total Path :" + countPath);
		sc.close();
	}

	private static int TotalPathOfMaze(int i, int j, int n, int m) {
		if (i == n - 1 && j == m - 1) {
			return 1;
		}
		if (i == n || j == m) {
			return 0;
		}

		int horz = TotalPathOfMaze(i, j + 1, n, m);
		int vert = TotalPathOfMaze(i + 1, j, n, m);
		return (horz + vert);
	}

}
