package a5b_Array;

import java.util.Scanner;

public class ArrayRotateSM {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5 };
		int k = 11222;
		System.out.println("Your Entered Array :");
		display(arr);
		rotate(arr, k);
		System.out.println("\n Your Rotated Array :");
		display(arr);
		scn.close();
	}

	private static void rotate(int[] arr, int k) {
		k = k % arr.length;
		if (k < 0) {
			k = k + arr.length;
		}
		revese(arr, 0, arr.length - 1 - k);
		revese(arr, arr.length - 1 - k + 1, arr.length - 1);
		revese(arr, 0, arr.length - 1);
	}

	private static void revese(int[] arr, int x, int y) {
		int i = x;
		int j = y;
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	private static void display(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "\t");
		}
	}
}
