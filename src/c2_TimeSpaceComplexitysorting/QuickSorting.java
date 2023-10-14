package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSorting {
	public static void quickSort(int[] arr, int low, int hi) {
		if (low >= hi) { // low > high -Both Correct
			return;
		}
		int pivot = arr[hi];
		int pi = partition(arr, pivot, low, hi);
		quickSort(arr, low, pi - 1);
		quickSort(arr, pi + 1, hi);
	}

	public static void swap(int[] arr, int i, int j) {
		System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partition(int[] arr, int pivot, int low, int hi) {
		System.out.println("pivot -> " + pivot);
		int i = low;
		int j = low;// <- Tricky Point
		while (i <= hi) {
			if (arr[i] <= pivot) {
				swap(arr, i, j);
				i++;
				j++;
			} else {
				i++;
			}
		}
		System.out.println("pivot index -> " + (j - 1));
		return (j - 1);
	}

	public static void main(String[] args) {
		System.out.println("Quick Sorting:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays:" + Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Arrays:" + Arrays.toString(arr));
		sc.close();
	}

}
