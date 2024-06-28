package e2_LinkedList;

import java.util.Arrays;

public class RemoveDuplicateInArray {
	public static void main(String[] args) {
		int[] arr = { 10, 10, 20, 20, 20 };

		Arrays.sort(arr);
		int[] temp = new int[arr.length];
		int j = 0;

		// Traverse the sorted array and store unique elements in temp
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}

		// Store the last element
		temp[j++] = arr[arr.length - 1];

		// Create a new array of the size of unique elements
		int[] newArray = new int[j];
		for (int i = 0; i < j; i++) {
			newArray[i] = temp[i];
		}

		// Print the original array and the new array with unique elements
		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Array after removing duplicates: " + Arrays.toString(newArray));
	}
}
