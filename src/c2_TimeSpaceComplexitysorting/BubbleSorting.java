package c2_TimeSpaceComplexitysorting;

import java.util.Arrays;

public class BubbleSorting {
	//
	public static void swap(int[] arr, int i, int j) {
		System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static boolean isSmaller(int[] arr, int i, int j) {
		System.out.println("Comparing " + arr[i] + " and " + arr[j]);
		if (arr[i] < arr[j]) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		/*
		 * System.out.println("Sorting:"); Scanner sc = new Scanner(System.in); int n =
		 * sc.nextInt(); int arr[] = new int[n]; for (int i = 0; i < arr.length; i++) {
		 * arr[i] = sc.nextInt(); }
		 */
		int[] arr = { 5, 9, 8, 2, 1 };
		System.out.println(arr.length);
		System.out.println("Arrays:" + Arrays.toString(arr));
		BubbleSorting(arr);
		System.out.println("Arrays:" + Arrays.toString(arr));
		// sc.close();
	}


	/**
	2024-Unable to understand For loops
	Time Complexity Will be O(n*n)
	1st Element is compared to Oth Element.
	*/
	private static void BubbleSorting(int[] arr) {
		for (int itr = 1; itr <= arr.length - 1; itr++) // Purpose is to make sure , Length is decreasing 
		{
			for (int j = 0; j < arr.length - itr; j++) // This loop is for comparision
			{
				if (isSmaller(arr, j + 1, j)) {
					swap(arr, j + 1, j);
				}
			}
			// System.out.println("Arrays " + itr + " : " + Arrays.toString(arr));
		}
	}
}
