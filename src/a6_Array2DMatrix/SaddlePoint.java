package a6_Array2DMatrix;

public class SaddlePoint {
	public static void main(String[] args) {
		int[][] matrix1 = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 39, 32, 33, 34 }, { 22, 42, 43, 44 } };
		// Invalid Input
		int[][] matrix = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		// Valid,Saddle Point 41

		for (int[] i : matrix) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < matrix.length; i++) {// Row Minimum
			int svj = 0;
			for (int j = 1; j < matrix.length; j++) {
				if (matrix[i][j] < matrix[i][svj]) {
					svj = j;
				}
			}
			boolean flag = true;
			for (int k = 0; k < matrix.length; k++) {
				if (matrix[k][svj] > matrix[i][svj]) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println("Saddle Point :" + matrix[i][svj]);
				return;
			}
		}
		System.out.println("Invalid Input");
	}
}
