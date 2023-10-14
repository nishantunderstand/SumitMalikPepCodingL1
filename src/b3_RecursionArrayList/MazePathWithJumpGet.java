package b3_RecursionArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathWithJumpGet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Row:");
		int n = scanner.nextInt();
		System.out.println("Enter Column:");
		int m = scanner.nextInt();
		ArrayList<String> paths = GetMazePath(1, 1, n, m);
		System.out.println("Paths Horizontal - Vertical - Diagonal");
		for (String string : paths) {
			System.out.println(string);
		}
		scanner.close();
	}

	private static ArrayList<String> GetMazePath(int sr, int sc, int dr, int dc) {
		ArrayList<String> hpath, vpath, dpath, bpath = new ArrayList<>();
		if (sr == dr && sc == dc) {
			bpath = new ArrayList<>();
			bpath.add("");
			return bpath;
		}
		ArrayList<String> paths = new ArrayList<>();
		// Horizontal Moves
		for (int ms = 1; ms <= dc - sc; ms++) {
			hpath = GetMazePath(sr, sc + ms, dr, dc);
			for (String i : hpath) {
				paths.add("h" + ms + i);
			}
		}
		// Vertical Moves
		for (int ms = 1; ms <= dr - sr; ms++) {
			vpath = GetMazePath(sr + ms, sc, dr, dc);
			for (String i : vpath) {
				paths.add("v" + ms + i);
			}
		}
		// Diagonal Moves
		for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
			dpath = GetMazePath(sr + ms, sc + ms, dr, dc);
			for (String i : dpath) {
				paths.add("d" + ms + i);
			}
		}
		return paths;
	}

}
