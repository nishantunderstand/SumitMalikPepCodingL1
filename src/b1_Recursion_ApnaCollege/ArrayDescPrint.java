package b1_Recursion_ApnaCollege;

import java.util.Scanner;

public class ArrayDescPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Length :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		PrintArrayDesc(arr, 0);
		sc.close();
	}

	private static void PrintArrayDesc(int[] arr, int idx) {

		if (idx == arr.length) {
			return;
		}

		// System.out.println(arr[idx]); // Ascending Order 
		PrintArrayDesc(arr, idx + 1);
		System.out.println(arr[idx]); // Descending Order
	}

}
