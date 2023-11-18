package a5b_Array;

import java.util.Arrays;

public class ArrayInverse {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 1, 2, 0 };
		int op = 0;
		int od = arr[0];
		System.out.println(Arrays.toString(arr));
		while (op < arr.length) {
			od = arr[op];
			System.out.println("od : " + od);
			int id = op;
			int ip = od;
			arr[ip] = id;
			op++;
		}
		System.out.println(Arrays.toString(arr));
	}
	/*
	 * Try to Manipulate in same array. That is wrong.
	 */

}
