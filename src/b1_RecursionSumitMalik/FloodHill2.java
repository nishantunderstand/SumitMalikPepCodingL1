package b1_RecursionSumitMalik;

import java.util.Arrays;
import java.util.Scanner;

public class FloodHill2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = 4;
		int m = 3;
		int[][] arr = { { 0, 1, 1 }, { 0, 0, 1 }, { 1, 0, 0 }, { 1, 0, 0 } };

		System.out.println("Input String :" + Arrays.deepToString(arr));
		boolean[][] visited = new boolean[n][m];
		System.out.println("Boolean Array:" + Arrays.deepToString(visited));
		floodfill(arr, 0, 0, "", visited);
		scanner.close();
	}

	public static void floodfill(int[][] maze, int row, int col, String asf, boolean[][] visited) {
		if (row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1
				|| visited[row][col] == true) {
			return;
		}
		if (row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(asf);
			return;
		}
		visited[row][col] = true;
		floodfill(maze, row - 1, col, asf + "t", visited);
		floodfill(maze, row, col - 1, asf + "l", visited);
		floodfill(maze, row + 1, col, asf + "d", visited);
		floodfill(maze, row, col + 1, asf + "r", visited);
		visited[row][col] = false;

	}

}
