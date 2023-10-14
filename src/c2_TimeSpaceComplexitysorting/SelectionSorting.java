package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSorting {
	public static void swap(int[] arr, int i, int j) {
		System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static boolean isSmaller(int[] arr, int i, int j) {
		System.out.println("Comparing " + arr[i] + " and " + arr[j]);
		if (arr[i] < arr[j]) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Sorting:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays:" + Arrays.toString(arr));
		SelectionSorting(arr);
		System.out.println("Arrays:" + Arrays.toString(arr));
		sc.close();
	}

	private static void SelectionSorting(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// int mi = arr[i]; <-- Only Index
			int mi = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (isSmaller(arr, j, mi)) {
					mi = j;
				}
			}
			swap(arr, i, mi);
			System.out.println("Arrays " + i + " : " + Arrays.toString(arr));

		}
	}
}
