package b1_RecursionSumitMalik;

import java.util.Scanner;

public class MazePathWithJumpPrint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Destination Row:");
		int n = scanner.nextInt();

		System.out.println("Destination Column:");
		int m = scanner.nextInt();

		System.out.println("Destination Row * Column = " + n + " * " + m);
		System.out.println("Maze Path with Jump :");
		MazePathWithJumpPrint(1, 1, n, m, "");

		scanner.close();
	}

	private static void MazePathWithJumpPrint(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			System.out.print("Paths:");
			System.out.println(psf);
			return;
		}
		// Horizontal
		for (int ms = 1; ms <= dc - sc; ms++) {
			MazePathWithJumpPrint(sr, sc + 1, dr, dc, psf + "h" + ms);
		}
		// Vertical
		for (int ms = 1; ms <= dr - sr; ms++) {
			MazePathWithJumpPrint(sr + 1, sc, dr, dc, psf + "v" + ms);
		}
		// Diagonal
		for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
			MazePathWithJumpPrint(sr + 1, sc + 1, dr, dc, psf + "d" + ms);
		}

	}

}
