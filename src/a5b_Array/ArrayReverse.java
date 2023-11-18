package a5b_Array;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("Your Entered Array :");
		display(arr);
		reverse(arr);
		System.out.println("\n Your Reversed Array :");
		display(arr);
		scn.close();
	}

	private static void display(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "\t");
		}
	}

	private static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

}
