package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPivotSortedRotated {
	public static void main(String[] args) {
		System.out.println("Sorting:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Arrays:" + Arrays.toString(arr));
		int pivot = ArrayPivotSortedRotated(arr);
		System.out.println("Pivot :" + pivot);// <- Pivot Index
		sc.close();
	}

	private static int ArrayPivotSortedRotated(int[] arr) {
		int lo = 0;
		int hi = arr.length - 1;

		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] < hi) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return arr[lo]; // return arr[hi] <-- Both Correct

	}

}
