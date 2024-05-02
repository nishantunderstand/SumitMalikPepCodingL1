package b5_backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class FloodHill {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/*
		 * System.out.println("Enter Array Row :"); int n = scanner.nextInt();
		 * System.out.println("Enter Array Column: "); int m = scanner.nextInt();
		 * 
		 * System.out.println("Enter Array Row - Column Data : "); int[][] arr = new
		 * int[n][m]; for (int i = 0; i < arr.length; i++) { for (int j = 0; j <
		 * arr[0].length; j++) { arr[i][j] = scanner.nextInt(); } }
		 */

		int n = 4;
		int m = 3;
		int[][] arr = { { 0, 1, 1 }, { 0, 0, 1 }, { 1, 0, 0 }, { 1, 0, 0 } };

		System.out.println("Input String :" + Arrays.deepToString(arr));
		boolean[][] visited = new boolean[n][m];
		System.out.println("Boolean Array:" + Arrays.deepToString(visited));
		FloodHill(arr, 0, 0, n, m, "", visited);
		scanner.close();
	}

	private static void FloodHill(int[][] maze, int sr, int sc, int dr, int dc, String path, boolean[][] visited) {

		if (sr < 0 || sc < 0 || sc == dr || sc == dr || maze[sr][sc] == 1 || visited[sr][sc] == true) {
			return;
		}

		if (sr == dr - 1 && sc == dc - 1) {
			System.out.println(path);
			return;
		}

		visited[sr][sc] = true;
		// Top
		FloodHill(maze, sr - 1, sc, dr, dc, path + "t", visited);
		// Left
		FloodHill(maze, sr, sc - 1, dr, dc, path + "l", visited);
		// Down
		FloodHill(maze, sr + 1, sc, dr, dc, path + "d", visited);
		// Right
		FloodHill(maze, sr, sc + 1, dr, dc, maze + "r", visited);
		visited[sr][sc] = false;

	}

}
