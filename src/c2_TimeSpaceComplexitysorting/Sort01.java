package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

public class Sort01 {
	public static void swap(int[] arr, int i, int j) {
		System.out.println("Swapping index " + i + " and index " + j);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		System.out.println("Sorting 0-1:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays:" + Arrays.toString(arr));
		Sort01(arr);
		System.out.println("Arrays:" + Arrays.toString(arr));
		sc.close();
	}

	private static void Sort01(int[] arr) {
		int i = 0;
		int j = 0;
		while (i < arr.length) {
			if (arr[i] == 1) {
				i++;
			} else {
				swap(arr, i, j);
				i++;
				j++;
			}
		}

	}
}
