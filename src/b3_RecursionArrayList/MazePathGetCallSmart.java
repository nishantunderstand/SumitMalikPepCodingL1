package b3_RecursionArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathGetCallSmart {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Row :");
		int n = scanner.nextInt();

		System.out.println("Enter the Column :");
		int m = scanner.nextInt();

		System.out.println("Row * Colum : " + n + "*" + m);

		ArrayList<String> path = GetMazePath(1, 1, n, m);
		System.out.println(path);

		scanner.close();
	}

	// sr - Source Row , sc - Source Column
	// dr - Destination Row, dc - Destination Column

	private static ArrayList<String> GetMazePath(int sr, int sc, int dr, int dc) {
		ArrayList<String> hpath = new ArrayList<>();
		ArrayList<String> vpath = new ArrayList<>();
		ArrayList<String> path = new ArrayList<>();
		ArrayList<String> bpath = new ArrayList<>();
		if (sr == dr && sc == dc) {
			bpath.add("");
			return bpath;
		}
		if (sr < dr) {
			vpath = GetMazePath(sr + 1, sc, dr, dc);
		}
		if (sc < dc) {
			hpath = GetMazePath(sr, sc + 1, dr, dc);
		}
		for (String i : hpath)
			path.add("h" + i);
		for (String i : vpath)
			path.add("v" + i);
		return path;
	}

}

/*
 * ArrayList<String> hpath = GetMazePath(sr, sc + 1, dr, dc); ArrayList<String>
 * vpath = GetMazePath(sr + 1, sc, dr, dc);
 * 
 * This is not Right
 * 
 */
