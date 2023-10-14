package a6_Array2DMatrix;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details");
		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 2, 3, 4 } };
		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 2, 3, 4 } };

		int prod[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					prod[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(prod[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();

	}

}
