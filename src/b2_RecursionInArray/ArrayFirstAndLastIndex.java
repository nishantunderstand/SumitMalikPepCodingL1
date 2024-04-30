package b2_RecursionInArray;

import java.util.Arrays;

/**
 * fsf : Found so Far , How many times is x is founded until now.
 * it will return an array 
 * 
 * L->R , fsf Value is Increasing 
 * R->L , fsf Value is Decreasing 
 *
 */
public class ArrayFirstAndLastIndex {
	public static void main(String[] args) {
		int arr[] = { 2, 2, 2, 2 };
		int data = 2;
		System.out.println(Arrays.toString(arr));
		int indics[] = ArrayFirstAndLastIndex(arr, data, 0, 0);
		System.out.println("Array Indices :" + Arrays.toString(indics));

	}

	private static int[] ArrayFirstAndLastIndex(int[] arr, int data, int idx, int fsf) {
		if (idx == arr.length) {
			return new int[fsf];
			// return -1; // You cannot return -1, it will give error.
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
