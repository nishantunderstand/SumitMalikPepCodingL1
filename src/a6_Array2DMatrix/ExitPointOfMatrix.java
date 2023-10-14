package a6_Array2DMatrix;

import java.util.Scanner;

public class ExitPointOfMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value:");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matrix = new int[n][m];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int i = 0;
		int j = 0;
		int dir = 0; // 0-EAST , 1 - SOUTH, 2 -WEST, 3 - NORTH
		while (true) {
			dir = (dir + matrix[i][j]) % 4;
			if (dir == 0) {
				j++;
			} else if (dir == 1) {
				i++;
			} else if (dir == 2) {
				j--;
			} else if (dir == 3) {
				i--;
			}

			if (i < 0) {
				i++;
				break;
			} else if (j < 0) {
				j++;
				break;
			} else if (i == n) {
				i--;
				break;
			} else if (j == m) {
				j--;
				break;
			}
		}
		System.out.println(i);
		System.out.println(j);
		sc.close();

	}

}
