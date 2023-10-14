package a6_Array2DMatrix;

public class SpiralTraversal {

	public static void main(String[] args) {
		int[][] matrix = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 }, { 41, 42, 43 }, { 51, 52, 53 } };
		int minr = 0;
		int minc = 0;
		int maxr = matrix.length - 1;
		int maxc = matrix[0].length - 1;
		int tne = matrix.length * matrix[0].length;
		int cnt = 0;
		while (cnt < tne) {
			// left Wall
			for (int i = minr, j = minc; i <= maxr && cnt < tne; i++) {
				System.out.println(matrix[i][j]);
				cnt++;
			}
			minc++;
			// bottom Wall
			for (int i = maxr, j = minc; j <= maxc && cnt < tne; j++) {
				System.out.println(matrix[i][j]);
				cnt++;
			}
			maxr--;
			// right Wall
			for (int i = maxr, j = maxc; i >= minr && cnt < tne; i--) {
				System.out.println(matrix[i][j]);
				cnt++;
			}
			maxc--;
			// top Wall
			for (int i = minr, j = maxc; j >= minc && cnt < tne; j--) {
				System.out.println(matrix[i][j]);
				cnt++;
			}
			minr++;
		}
	}
}
