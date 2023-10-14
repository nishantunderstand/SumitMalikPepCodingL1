package b1_RecursionSumitMalik;

import java.util.Scanner;

public class MazePathPrint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Destination Row:");
		int n = scanner.nextInt();

		System.out.println("Destination Column:");
		int m = scanner.nextInt();

		System.out.println("Destination Row * Column = " + n + " * " + m);

		MazePathPrint(0, 0, n, m, "");
		scanner.close();
	}

	private static void MazePathPrint(int sr, int sc, int dr, int dc, String psf) {
		if (sr > dr || sc > dc) {
			return;
		}
		if (sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}
		MazePathPrint(sr, sc + 1, dr, dc, psf + "h");
		MazePathPrint(sr + 1, sc, dr, dc, psf + "v");
	}

}
