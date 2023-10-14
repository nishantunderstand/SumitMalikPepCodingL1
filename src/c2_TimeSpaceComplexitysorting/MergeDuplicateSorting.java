package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeDuplicateSorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Merge 2 Sorted Arrays:");
		int n1 = sc.nextInt();
		int arr[] = new int[n1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array 1: " + Arrays.toString(arr));
		int sortedmerge[] = SortingMerge(arr, 0, arr.length - 1);
		System.out.println("Merge Sorted :" + Arrays.toString(sortedmerge));

	}

	private static int[] SortingMerge(int[] arr, int low, int hi) {
		if (low == hi) {
			int ba[] = new int[1];
			ba[0] = arr[low];
			return ba;
		}
		int mid = (low + hi) / 2;
		int fsh[] = SortingMerge(arr, low, mid);
		System.out.println("First SH : " + Arrays.toString(fsh));
		int ssh[] = SortingMerge(arr, mid + 1, hi);
		System.out.println("Second SH : " + Arrays.toString(ssh));
		int fsa[] = ArrayMergeTwoSorted(fsh, ssh);
		System.out.println("Full SA : " + Arrays.toString(fsa));
		return fsa;
	}

	private static int[] ArrayMergeTwoSorted(int[] arr1, int[] arr2) {

		System.out.println("Merging these two arrays: ");

		System.out.println("left arrays -> ");
		System.out.println(Arrays.toString(arr1));

		System.out.println("right arrays -> ");
		System.out.println(Arrays.toString(arr2));
		int i = 0;
		int j = 0;
		int k = 0;
		int mergedArr[] = new int[arr1.length + arr2.length];
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				mergedArr[k] = arr1[i];
				i++;
				k++;
			} else {
				mergedArr[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < arr1.length) {
			mergedArr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			mergedArr[k] = arr2[j];
			j++;
			k++;
		}
		return mergedArr;
	}
}
