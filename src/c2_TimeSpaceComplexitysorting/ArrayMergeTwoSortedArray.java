package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Does it support UnSorted Array ?
 * What if there length is disimilar ? How to Handle that ?
 */
public class ArrayMergeTwoSortedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Merge 2 Sorted Arrays:");
		/*
		 * int n1 = sc.nextInt(); int arr1[] = new int[n1]; for (int i = 0; i <
		 * arr1.length; i++) { arr1[i] = sc.nextInt(); }
		 */
		int[] arr1 = {2,5,12,18,20};
		/*
		 * int n2 = sc.nextInt(); int arr2[] = new int[n2]; for (int i = 0; i <
		 * arr2.length; i++) { arr2[i] = sc.nextInt();
		 * 
		 * }
		 */
		int[] arr2 = {7,9,11,15,25,28,30,35};
		int mergedSortedArr[] = ArrayMergeTwoSorted(arr1, arr2);
		System.out.println("Array 1: " + Arrays.toString(arr1));
		System.out.println("Array 2: " + Arrays.toString(arr2));
		System.out.println("Merged 1-2 Sorted :" + Arrays.toString(mergedSortedArr));
	}

	private static int[] ArrayMergeTwoSorted(int[] arr1, int[] arr2) {
		//Initializa it 
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
		// Remaining 
		while (i < arr1.length) { // <- Dump Remaining Array Without Comparing
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

/*
 * - If you remove && IndexOutOfBoundError
 */
