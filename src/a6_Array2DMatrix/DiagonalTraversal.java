package a6_Array2DMatrix;

public class DiagonalTraversal {

	public static void main(String[] args) {

		int[][] matrix = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 }, };
		for (int g = 0; g < matrix.length; g++) {
			for (int i = 0, j = g; j < matrix.length; i++, j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}
}
