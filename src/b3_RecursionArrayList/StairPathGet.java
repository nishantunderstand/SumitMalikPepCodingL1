package b3_RecursionArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StairPathGet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Number:");
		int n = scanner.nextInt();
		ArrayList<String> paths = GetStairPath(n);
		System.out.println("Stair Paths:");
		System.out.println(paths);
		scanner.close();
	}

	private static ArrayList<String> GetStairPath(int n) {
		if (n == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		} else if (n < 0) {
			ArrayList<String> bres = new ArrayList<>();
			return bres;
		}

		ArrayList<String> path1 = GetStairPath(n - 1);
		ArrayList<String> path2 = GetStairPath(n - 2);
		ArrayList<String> path3 = GetStairPath(n - 3);
		ArrayList<String> paths = new ArrayList<>();

		for (String i : path1) {
			paths.add(1 + i);
		}
		for (String i : path2) {
			paths.add(2 + i);
		}
		for (String i : path3) {
			paths.add(3 + i);
		}
		return paths;
	}

}

/*
 * if (n == 0) { ArrayList<String> bres = new ArrayList<>(); bres.add("");
 * return bres; } else (n < 0) { ArrayList<String> bres = new ArrayList<>();
 * return bres; }
 * 
 * ArrayList<String> path1 = GetStairPath(n - 1); //<-- Error State
 * ArrayList<String> path2 = GetStairPath(n - 2); ArrayList<String> path3 =
 * GetStairPath(n - 3);
 * 
 * 
 */
