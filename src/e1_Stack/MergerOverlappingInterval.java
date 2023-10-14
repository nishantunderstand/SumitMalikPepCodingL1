package e1_Stack;

import java.util.Arrays;
import java.util.Scanner;

public class MergerOverlappingInterval {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Overlapping Intervals:");
		int n = sc.nextInt();

		int arr[][] = new int[n][2];

		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		System.out.println("Arrays:" + Arrays.deepToString(arr));
		MergerOverlappingInterval(arr);
		sc.close();
	}

	private static void MergerOverlappingInterval(int[][] arr) {

	}

	public static class Pair {
		int st;
		int et;

		Pair(int st, int et) {
			this.st = st;
			this.et = et;
		}
	}

}
