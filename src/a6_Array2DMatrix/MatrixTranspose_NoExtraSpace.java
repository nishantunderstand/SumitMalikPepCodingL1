package a6_Array2DMatrix;

public class MatrixTranspose_NoExtraSpace {
	public static void main(String[] args) {
		int[][] matrix = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		System.out.println("Original Matrix");
		displayMatrix(matrix);
		int trans_matrix[][] = MatrixTranspose(matrix);
		System.out.println("Transposed Matrix");
		displayMatrix(trans_matrix);
	}

	private static int[][] MatrixTranspose(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[i].length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}

		}
		return matrix;
	}

	private static void displayMatrix(int[][] matrix) {
		for (int[] i : matrix) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}
