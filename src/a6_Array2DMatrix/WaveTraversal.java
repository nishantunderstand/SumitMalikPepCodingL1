package a6_Array2DMatrix;

import java.util.Arrays;

public class WaveTraversal {

	public static void main(String[] args) {
		int[][] matrix = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 } };
		System.out.println(Arrays.deepToString(matrix));
		for (int j = 0; j < matrix[0].length; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < matrix.length; i++) {
					System.out.print(matrix[i][j] + "\t");
				}
			} else {
				for (int i = matrix.length - 1; i >= 0; i--) {
					System.out.print(matrix[i][j] + "\t");
				}
			}
		}
	}
}
