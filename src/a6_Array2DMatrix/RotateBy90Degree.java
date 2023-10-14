package a6_Array2DMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class RotateBy90Degree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array:");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		// Transpose
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		// Row Reverse
		for (int i = 0; i < matrix.length; i++) {
			int li = 0;
			int ri = matrix.length - 1;
			while (li < ri) {
				int temp = matrix[i][li];
				matrix[i][li] = matrix[i][ri];
				matrix[i][ri] = temp;
				li++;
				ri--;
			}
		}

		System.out.println(Arrays.deepToString(matrix));

		sc.close();
	}

}
