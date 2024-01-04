package a5b_Array;

import java.util.Scanner;

public class ArrayBarChartSummitMalik {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// System.out.println("Bar Chart");
		int[] arr = { 3, 6, 1, 0, 5 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int floor = max; floor >= 1; floor--) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= floor) {
					System.out.print("*\t");
				} else {
					System.out.print("\t"); // Tab Missing
				}
			}
			System.out.println();
		}


	}
}
