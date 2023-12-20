package b2;

import java.util.Scanner;

public class ArrayFirstIndexRecursive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 2, 2, 2, 2 };
		int data = 2;
		int firstIndex = ArrayFirstIndex(arr, 0, data);
		// System.out.println(Arrays.toString(arr));
		// System.out.println(arr.length);
		System.out.println("Array First Index of " + data + " is : " + (firstIndex));
		sc.close();
	}

	private static int ArrayFirstIndex(int[] arr, int idx, int data) {
		if (idx == arr.length) {
			return -1;
		}
		int fisma = ArrayFirstIndex(arr, idx + 1, data);
		if (arr[idx] == data) {
			return idx;
		} else {
			return fisma;
		}
	}
}

/*
 * 
 * System.out.print("Enter the Array Length :"); int n = sc.nextInt(); int arr[]
 * = new int[n];
 * 
 * System.out.println("Enter the Values for Array :"); for (int i = 0; i <
 * arr.length; i++) { arr[i] = sc.nextInt(); }
 * 
 * System.out.println("Your Entered Arrays : " + Arrays.toString(arr));
 * 
 * 
 * System.out.println("Enter the Data to Find Occurence in the Array :"); int
 * data = sc.nextInt();
 */

// Why we are returning -1 ?
// We want something that is not present in the Program

/*
 * When this program will Fail ? 1] Empty Array 2] Data is not Present in the
 * Array
 */
