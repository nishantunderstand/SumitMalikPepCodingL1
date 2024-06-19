package b1_Recursion_ApnaCollege;

import java.util.Scanner;

public class ArrayAsecPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Length :\n");
		int arr[] = {1,2,3,4,5};		
		PrintArrayDesc(arr, 0);
		sc.close();
	}

	private static void PrintArrayDesc(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
		System.out.println(arr[idx]); // Ascending Order 
		PrintArrayDesc(arr, idx + 1);
		//System.out.println(arr[idx]); // Descending Order
	}
}
