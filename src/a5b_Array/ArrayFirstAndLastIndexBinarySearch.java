package a5b_Array;

import java.util.Scanner;

public class ArrayFirstAndLastIndexBinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Length :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int data = sc.nextInt();
		FirstAndLastIndexBinarySearch(arr, data);
		sc.close();
	}

	private static void FirstAndLastIndexBinarySearch(int[] arr, int data) {
		int low = 0;
		int high = arr.length - 1;
		int fidx = -1;
		int lidx = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (data > arr[mid]) {
				low = mid + 1;
			} else if (data < arr[mid]) {
				high = mid - 1;
			} else {
				fidx = mid;
				high = mid - 1;
			}
		}

		low = 0;
		high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (data > arr[mid]) {
				low = mid + 1;
			} else if (data < arr[mid]) {
				high = mid - 1;
			} else {
				lidx = mid;
				low = mid + 1;
			}
		}

		System.out.println("First Occurence" + data + "=" + fidx);
		System.out.println("Last Occurence" + data + "=" + lidx);
	}
}
