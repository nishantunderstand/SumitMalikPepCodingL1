package a6_Array2DMatrix;

import java.util.Scanner;

public class MatrixPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details:");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int[][] matrix = new int[r1][c1];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		sc.close();

	}

}
