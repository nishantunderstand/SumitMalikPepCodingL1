package a6_Array2DMatrix;

public class SearchInSorted2DArray {

	public static void main(String[] args) {

		int[][] matrix = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		int i = 0;
		int j = matrix[0].length - 1;
		int data = 26; // Invalid Input
		int data1 = 31; // Present in Matrix
		while (i < matrix.length && j >= 0) {
			if (data == matrix[i][j]) {
				System.out.println(data + " is Present in Matrix at index " + i + "," + j);
				return;
			} else if (data < matrix[i][j]) {
				j--;
			} else {
				i++;
			}
		}
		System.out.println("Invalid Input");
	}
}
