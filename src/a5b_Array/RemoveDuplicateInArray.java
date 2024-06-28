package a5b_Array;

import java.util.Arrays;
/**
 * Unsorted - Convert to Sorted
 * Sorted - I can solve
 * 2 Pointer we can, Fast and Slow pointer
 */


/** 
We need to think, Is Next Element Duplicate of Current Element, If then remove it.
How these Code is Different From LeetCode.
LeetCode is telling to bring those number in Front.
*/
public class RemoveDuplicateInArray {
	public static void main(String[] args) {
		int arr[] = { 10,10,10,10, 20,20, 30, 30 };
		System.out.println(Arrays.toString(arr));
		int result[] = new int[arr.length];
		int i=0;
		int j=1;
		int k=0;

		result[k++] = arr[i]; // 1st Element is always going to be unique

		while(i<arr.length && j <arr.length){
			if(arr[i]!=arr[j]){
				result[k]=arr[j]; // Why we are adding j 
			}
			i++;
			j++;
			k++;
		}

		System.out.println(Arrays.toString(result));
	}
}