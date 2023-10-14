package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSelect {

	public static int quickSelect(int[] arr, int lo, int hi, int k) {

		int pivot = arr[hi];
		int pi = partition(arr, pivot, lo, hi);

		if (k > pi) {
			return quickSelect(arr, pi + 1, hi, k);
		} else if (k < pi) {
			return quickSelect(arr, lo, pi - 1, k);
		} else {
			return pivot;// <- Tricky Point
			// return arr[pi];//<- Correct But Less Accurate
		}

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
		int k = sc.nextInt();
		System.out.println("Arrays:	" + Arrays.toString(arr));
		System.out.println(quickSelect(arr, 0, arr.length - 1, k - 1)); // <- Tricky Point
		sc.close();

	}
}
