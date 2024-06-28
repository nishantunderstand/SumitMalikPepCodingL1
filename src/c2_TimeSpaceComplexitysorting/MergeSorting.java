package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;
/**
Terminology 
lo : Low
hi : High
mid : mid 
FSH : FirstSortedHalf
SSH : SecondSortedHalf
FSA : FinalSortedArray

It is based on MergeSortedArray.
As we are returning an Array , Annoymous array is a good option.


Corner Cases
Size 1,0
Array Elements are Negative 
Same Number

Intution : While Coding First Handle Postivie, Then Zero And Then Negative Cases.

- Does the length of array make an impact ? Odd / Even 
*/


public class MergeSorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Merge 2 Sorted Arrays:");		
		int[] arr2 = {5,9,2,8,1,-1,0};
		int[] arr = {0,0,0};
		System.out.println("Array 1: " + Arrays.toString(arr));
		int sortedmerge[] = SortingMerge(arr, 0, arr.length - 1);
		System.out.println("Merge Sorted :" + Arrays.toString(sortedmerge));
		sc.close();
	}

	// Purpose of this code is like Divide and conquer Approach.
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

	/**
	 * It is based on Divide and Conquer Approach.
	 * Find the mid
	 * Sort the First Sorted Half (FSH) , SSH
	 * When it size is Zero, Treat as one unit. Then return as one.
	 * Then Call MergeSort Code
	 */

	private static int[] ArrayMergeTwoSorted(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		int k = 0;
		//? Do i need to perform Sorting as well. Like I performed in merged sorting.
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
		// End of While Loop. Dumping the remainig Array.
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
