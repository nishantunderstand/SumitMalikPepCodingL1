package a5b_Array;

import java.util.Arrays;

public class ArrayRotateNishant {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		// Here Rotate by k , Means Rotating from last 2 Elements.
		System.out.println("Input k :" + k);
		k = k % arr.length;
		if (k < 0) {
			k += arr.length;
		}
		int beg = 0;
		int end = arr.length - 1;
		System.out.println("Arrays Before Rotate :" + Arrays.toString(arr));
		System.out.println("Rotate Array by k : " + k);
		reverse(arr, beg, end - k);
		reverse(arr, end - k + 1, end);
		reverse(arr, beg, end);
		System.out.println("Arrays After Rotate :" + Arrays.toString(arr));

	}

	private static void reverse(int[] arr, int beg, int end) {
		int li = beg;
		int ri = end;
		while (li <= ri) {
			int temp = arr[li];
			arr[li] = arr[ri];
			arr[ri] = temp;
			li++;
			ri--;
		}

	}

}