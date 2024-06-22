package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

/**
Does it support UnSorted Array ?
What if there length is disimilar ? How to Handle that ?
If you remove && IndexOutOfBoundError
- Can we create a Function that will dump that final data in the array. This is going to really easy.

Corer Cases:
Size Zero
Unsorted Arrays
Element Left in One Array
 */
public class ArrayMergeTwoSortedArrayFinal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println("Merge 2 Sorted Arrays:");
		int[] arr1 = {2,5,12,18,20,9,1};		
		int[] arr2 = {7,9,11,15,25,28,30,35,3,2};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println("Array 1: " + Arrays.toString(arr1));
		System.out.println("Array 2: " + Arrays.toString(arr2));

		int mergedSortedArr[] = ArrayMergeTwoSorted(arr1, arr2);
		System.out.println("Merged 1-2 Sorted :" + Arrays.toString(mergedSortedArr));
	}

	private static int[] ArrayMergeTwoSorted(int[] arr1, int[] arr2) {
		//Initialize it 
		int i = 0;
		int j = 0;
		int k = 0;
		int mergedArr[] = new int[arr1.length + arr2.length];
		

		/* 
		k<mergedArr.length : You think this would work.
		What if array is small.
		Sooner or later it will reach zero.
		Then you face IndexOutOfError.
		So You need to think about it.
		*/
		while (i<arr1.length && j<arr2.length) 
		{
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
		// <- Dump Remaining Array Without Comparing
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


