package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {

	public static void main(String[] args) {
		System.out.println("Radix Sorting:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Original Arrays:" + Arrays.toString(arr));
		radixSort(arr);
		sc.close();
	}

	public static void radixSort(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		for (int exp = 1; max / exp >= 1; exp = exp * 10) {
			CountSort(arr, exp);
		}
	}

	private static void CountSort(int[] arr, int exp) {
		int ans[] = new int[arr.length];
		int farr[] = new int[10]; // 3 Frequency Array
		for (int i = 0; i < arr.length; i++) { // 4 Storing the Count
			farr[(arr[i] / exp) % 10]++;
		}
		for (int i = 1; i < farr.length; i++) { // 5 Prefix Sum Array && Array Index 1
			farr[i] += farr[i - 1];
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			int pos = farr[(arr[i] / exp) % 10] - 1;
			ans[pos] = arr[i];
			farr[(arr[i] / exp) % 10]--;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ans[i];
		}
		System.out.print("After sorting on " + exp + " place -> ");
		System.out.println(Arrays.toString(arr)); // <-- ans is wrong
	}

}
