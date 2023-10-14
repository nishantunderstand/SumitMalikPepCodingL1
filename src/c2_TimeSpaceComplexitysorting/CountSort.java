package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
	public static void main(String[] args) {
		System.out.println("Sorting:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		// Step 1
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println("Original Arrays:" + Arrays.toString(arr));
		CountSort(arr, min, max);

		sc.close();
	}

	private static void CountSort(int[] arr, int min, int max) {
		int range = max - min + 1; // 2
		int farr[] = new int[range]; // 3 Frequency Array
		for (int i = 0; i < arr.length; i++) { // 4 Storing the Count
			int idx = arr[i] - min;
			farr[idx]++;
		}
		System.out.println("Frequency Arrays:" + Arrays.toString(farr));
		for (int i = 1; i < farr.length; i++) { // 5 Prefix Sum Array && Array Index 1
			farr[i] = farr[i] + farr[i - 1];
		}
		System.out.println("Prefix Sum Arrays:" + Arrays.toString(farr));
		int ans[] = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			int val = arr[i];
			int pos = farr[val - min];
			int idx = pos - 1;
			ans[idx] = val;
			farr[val - min]--;

		}
		System.out.println("Count Sort Arrays:" + Arrays.toString(ans));
	}

}

/*
 * 15 9 6 3 5 3 4 3 9 6 4 6 5 8 9 9
 * 
 */
