package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSorting {
	public static void swap(int[] arr, int i, int j) {
		System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static boolean isGreater(int[] arr, int j, int i) {
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
		int[] arr = {5,9,2,8,1};
		/*
		 * int n = sc.nextInt(); int arr[] = new int[n]; for (int i = 0; i < arr.length;
		 * i++) { arr[i] = sc.nextInt(); }
		 */
		System.out.println("Arrays:" + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Arrays:" + Arrays.toString(arr));
		sc.close();
	}

	private static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (isGreater(arr, j, j + 1)) {
					swap(arr, j, j + 1);
				} else {
					break;
				}
			}
			System.out.println("Arrays " + i + " : " + Arrays.toString(arr));
		}

	}
}
