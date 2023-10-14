package b1_RecursionSumitMalik;

public class FloodHillAttempt {
	public static void main(String[] args) {
		int n = 3;
		int m = 3;
		int[][] arr = { { 0, 0, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

		boolean[][] visit = new boolean[n][m];
		FloodHillAttempt(arr, 0, 0, n, m, "", visit);
	}

	private static void FloodHillAttempt(int[][] maze, int sr, int sc, int dr, int dc, String path, boolean[][] visit) {

		if (sr < 0 || sc < 0 || sr == dr || sc == dc || maze[sr][sc] == 1 || visit[sr][sc] == true) {
			return;
		}

		if (sr == dr - 1 && sc == dc - 1) {
			System.out.println(path);
			return;
		}
		visit[sr][sc] = true;
		FloodHillAttempt(maze, sr - 1, sc, dr, dc, path + "t", visit); // top
		FloodHillAttempt(maze, sr, sc - 1, dr, dc, path + "l", visit); // left
		FloodHillAttempt(maze, sr + 1, sc, dr, dc, path + "d", visit); // down
		FloodHillAttempt(maze, sr, sc + 1, dr, dc, path + "r", visit); // right
		visit[sr][sc] = false;
	}
}
