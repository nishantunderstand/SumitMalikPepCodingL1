package b2_RecursionInArray;

import java.util.Scanner;

/**
 * What is wrong in this Approach ?
 */

public class ArrayFirstIndexRecursiveBasedOnLastIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 2, 2, 2, 2,3,3,3,3 };
		int data = 4;
		int firstIndex = ArrayLastIndexBasedOnFirstIndex(arr, arr.length-1, data);
		if(firstIndex==-1) {
			System.out.println("Element is not present in the Array , Try Again");
		}else {
			System.out.println("Array First Index of " + data + " is : " + (firstIndex+1));
		}
		
		sc.close();
	}

	private static int ArrayLastIndexBasedOnFirstIndex(int[] arr, int idx, int data) {
		// Base Case
		// What else we can write in Base Case ? Can we write idx<0 || idx==arr.length ? Guide me
		if (idx <0) {
			return -1;
		}
		// Call Recursive Function
		int misma = ArrayLastIndexBasedOnFirstIndex(arr, idx - 1, data);
		// Perform Action
		if (arr[idx] == data) {
			return idx;
		} else {
			return misma;
		}
	}
}




