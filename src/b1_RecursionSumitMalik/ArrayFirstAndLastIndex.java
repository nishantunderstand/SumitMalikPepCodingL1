package b1_RecursionSumitMalik;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFirstAndLastIndex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Array Length:");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element for Array: ");
		for (int i : arr) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Your Entered Array:");

		System.out.println("Enter the data index you want to find");
		int data = scanner.nextInt();

		System.out.println(Arrays.toString(arr));

		int indics[] = ArrayFirstAndLastIndex(arr, data, 0, 0);
		System.out.println("Array Indices :" + Arrays.toString(indics));
		scanner.close();
	}

	private static int[] ArrayFirstAndLastIndex(int[] arr, int data, int idx, int fsf) {
		if (idx == arr.length) {
			return new int[fsf];
		}

		if (arr[idx] == data) {
			int[] iarr = ArrayFirstAndLastIndex(arr, data, idx + 1, fsf + 1);
			iarr[fsf] = idx;
			return iarr;
		} else {
			int[] iarr = ArrayFirstAndLastIndex(arr, data, idx + 1, fsf);
			return iarr;
		}
	}

}

/*
 * private static int[] ArrayFirstAndLastIndex(int[] arr, int data, int idx, int
 * fsf) { if (idx == arr.length) { int[] iarr = new int[fsf]; return iarr; <---
 * }
 * 
 * if (arr[idx] == data) { int[] iarr = ArrayFirstAndLastIndex(arr, data, idx +
 * 1, fsf + 1); iarr[fsf] = idx; return iarr; } else { int[] iarr =
 * ArrayFirstAndLastIndex(arr, data, idx + 1, fsf); return iarr; } }
 * 
 * 
 */
