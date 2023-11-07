package a5b_Array;

import java.util.Scanner;

public class ArrayBarChart {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Number of Element to be Inserted");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		BarChart(arr);

		scn.close();
	}

	private static void BarChart(int[] arr) {
		for (int i : arr) {
			System.out.println("Element in Array : " + i);
		}

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Maximium in the Floor : " + max);
		for (int floor = max; floor >= 1; floor--) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= floor) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
