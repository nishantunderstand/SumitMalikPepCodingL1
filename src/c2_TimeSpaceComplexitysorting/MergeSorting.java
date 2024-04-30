package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Merge 2 Sorted Arrays:");
		
		int[] arr = {5,9,2,8,1};
		/*
		 * int n1 = sc.nextInt(); int arr[] = new int[n1]; for (int i = 0; i <
		 * arr.length; i++) { arr[i] = sc.nextInt(); }
		 */
		
		System.out.println("Array 1: " + Arrays.toString(arr));
		int sortedmerge[] = SortingMerge(arr, 0, arr.length - 1);
		System.out.println("Merge Sorted :" + Arrays.toString(sortedmerge));
	}

	private static int[] SortingMerge(int[] arr, int low, int hi) {
		// This is used to Handle, When we have Single Element in Array
		if (low == hi) {
			int ba[] = new int[1];
			ba[0] = arr[low];
			return ba;
		}
		int mid = (low + hi) / 2;
		int fsh[] = SortingMerge(arr, low, mid);
		System.out.println("FSH:"+Arrays.toString(fsh));
		int ssh[] = SortingMerge(arr, mid + 1, hi);
		System.out.println("SSH:"+Arrays.toString(ssh));
		int fsa[] = ArrayMergeTwoSorted(fsh, ssh);
		System.out.println("FSA:"+Arrays.toString(fsa));
		return fsa;
	}

	private static int[] ArrayMergeTwoSorted(int[] arr1, int[] arr2) {
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
