package b2_RecursionInArray;

import java.util.Scanner;

/**
 Why we are returning -1 ? 
 We want something that is not present in the Program
 When this program will Fail ? 
 1] Empty Array 
 2] Data is not Present in the Array
 
 
 In any Recursive Function, We need 3 Things
 1. Base Case
 2. Recursive Call
 3. Action, How to Reach to Result ?
 */

public class ArrayFirstIndexRecursive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 2, 2, 2, 2 };
		int data = 2;
		int firstIndex = ArrayFirstIndex(arr, 0, data);
		// System.out.println(Arrays.toString(arr));
		// System.out.println(arr.length);
		System.out.println("Array First Index of " + data + " is : " + (firstIndex));
		sc.close();
	}

	private static int ArrayFirstIndex(int[] arr, int idx, int data) {
		// Base Case
		// What else we can write in Base Case ? Can we write idx<0 || idx==arr.length ? Guide me
		if (idx == arr.length) {
			return -1;
		}
		// Call Recursive Function
		int fisma = ArrayFirstIndex(arr, idx + 1, data);
		// Perform Action
		if (arr[idx] == data) {
			return idx;
		} else {
			return fisma;
		}
	}
}




