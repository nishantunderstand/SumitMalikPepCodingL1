package b1_RecursionSumitMalik;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLastIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Array Length :");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the Values for Array :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Your Entered Arrays : " + Arrays.toString(arr));

		System.out.println("Enter the Data to Find Occurence in the Array :");
		int data = sc.nextInt();

		int lastIndex = ArrayLastIndex(arr, 0, data);
		System.out.println("Array Last Index " + data + "=" + lastIndex);

		sc.close();

	}

	private static int ArrayLastIndex(int[] arr, int idx, int data) {
		if (idx == arr.length) {
			return -1;
		}
		int lisma = ArrayLastIndex(arr, idx + 1, data);
		if (lisma == -1) {
			if (arr[idx] == data) {
				return idx;
			} else {
				return -1;
			}
		} else {
			return lisma;
		}
	}
}
