package a5b_Array;

import java.util.Arrays;

public class ArrayInverseSM {
	public static void main(String[] args) {
		int arr[] = { 3, 4, 1, 2, 0 };
		int op = 0;
		int od = arr[0];
		int inv[] = new int[arr.length];
		System.out.println(Arrays.toString(arr));
		while (op < arr.length) {
			od = arr[op];
			int id = op;
			int ip = od;
			inv[ip] = id;
			op++;
		}
		System.out.println(Arrays.toString(inv));
	}
}
