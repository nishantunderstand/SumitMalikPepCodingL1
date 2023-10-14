package b1_RecursionApnaCollege;

import java.util.Scanner;

public class ArrayDescPrint2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Length :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array : ");
		PrintArrayDesc(arr, arr.length - 1);

		sc.close();
	}

	private static void PrintArrayDesc(int[] arr, int idx) {

		if (idx < 0) {
			return;
		}
		System.out.print(arr[idx] + "\t"); // Descending Order
		PrintArrayDesc(arr, idx - 1);
	}

}
