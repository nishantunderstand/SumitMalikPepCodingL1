package a6_Array2DMatrix;

public class MatrixRotate90DegreeAntiClockWise {
	public static void main(String[] args) {
		String[][] matrix = { { "a", " b", "c", "d" }, { "e", "f", "g", "h" }, { "i", "j", "k", "l" },
				{ "m", "n", "o", "p" } };

		System.out.println("Original Matrix:");
		displayMatrix(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				String temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		System.out.println("Transpose Matrix:");
		displayMatrix(matrix);
		rowReverse(matrix);
		System.out.println("Row Reverse / Roated by 90 Degree:");
		displayMatrix(matrix);
	}

	private static void rowReverse(String[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int li = 0;
			int ri = matrix[i].length - 1;
			while (li <= ri) {
				String temp = matrix[i][li];
				matrix[i][li] = matrix[i][ri];
				matrix[i][ri] = temp;
				li++;
				ri--;
			}
		}
	}

	private static void displayMatrix(String[][] matrix) {
		for (String[] i : matrix) {
			for (String j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}

}
