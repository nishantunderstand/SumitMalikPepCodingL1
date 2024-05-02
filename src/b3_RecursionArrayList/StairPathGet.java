package b3_RecursionArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Think of Euler Diagram.
 * {@link }
 */
public class StairPathGet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Number:");
		// int n = scanner.nextInt();
		int n = 5;
		ArrayList<String> paths = GetStairPath(n);
		System.out.println("Stair Paths:");
		System.out.println(paths);
		scanner.close();
	}

	private static ArrayList<String> GetStairPath(int n) {
		ArrayList<String> bres = new ArrayList<>(); // Also Correct // Global Declare
		if (n == 0) {
			// ArrayList<String> bres = new ArrayList<>(); // Local Declare
			bres.add("");
			return bres;
		} else if (n < 0) {
			// ArrayList<String> bres = new ArrayList<>();
			return bres;
		}
		
		ArrayList<String> path1 = GetStairPath(n - 1);
		ArrayList<String> path2 = GetStairPath(n - 2);
		ArrayList<String> path3 = GetStairPath(n - 3);
		ArrayList<String> paths = new ArrayList<>();
		// Why did we create paths, As we need to merge the results.
		// That's the only way to merge it.

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
