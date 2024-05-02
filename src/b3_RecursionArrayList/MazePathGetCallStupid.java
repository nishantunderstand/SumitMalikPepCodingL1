package b3_RecursionArrayList;

//package _resume; 
/**
You can use whatever you want to Create a interlinking. 
Goal is to resume task
Principle of Productivity is fixed. They are not going to be changed.
So be 100% Sure For that.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * {@link StairPathGet} You can make Smart Call, You can Apply Condition as well
 * on Calling {@link MazePathGetCallSmart} What if n!=m ? How will you Handle
 * that Case ? Then You need to write those cases as well.
 * hpath : Horizontal Path, i.e. X-Axis
 * vpath : Vertical Path i.e. Y-Axis
 */
public class MazePathGetCallStupid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Row :");
		// int n = scanner.nextInt();
		int n = 1;
		System.out.println("Enter the Column :");
		// int m = scanner.nextInt();
		int m = 2;
		System.out.println("Row * Colum : " + n + "*" + m);

		ArrayList<String> path = GetMazePath(1, 1, n, m);
		System.out.println(path);

		scanner.close();
	}

	// sr - Source Row , sc - Source Column
	// dr - Destination Row, dc - Destination Column

	private static ArrayList<String> GetMazePath(int sr, int sc, int dr, int dc) {
		ArrayList<String> bres = new ArrayList<>();
		if (sr > dr || sc > dc) {
			return bres;
		}
		if (sr == dr && sc == dc) {
			bres.add("");
			return bres;
		}
		ArrayList<String> hpath = GetMazePath(sr, sc + 1, dr, dc);
		ArrayList<String> vpath = GetMazePath(sr + 1, sc, dr, dc);
		ArrayList<String> path = new ArrayList<>();
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
