package b1_Recursion_ApnaCollege;

import java.util.Scanner;

public class ArrayDescPrint_LastIndexPassed {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter the Array elements:");
		int arr[] = {1,2,3,4,5};
		System.out.println("Array : ");
		PrintArrayDesc(arr); // Ignore it.
		PrintArrayDesc(arr, arr.length - 1);

		sc.close();
	}

	private static void PrintArrayDesc(int[] arr) {
		if (arr.length < 0) {
			return;
		}
		// What code to write ?
		// Cannot be Achieved
	}

	private static void PrintArrayDesc(int[] arr, int idx) {
		if (idx < 0) {
			return;
		}
		System.out.print(arr[idx] + "\t"); // Descending Order		
		PrintArrayDesc(arr, idx - 1);
	}
}
