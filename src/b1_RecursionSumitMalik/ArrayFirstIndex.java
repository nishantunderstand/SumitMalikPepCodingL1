package b1_RecursionSumitMalik;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFirstIndex {
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
		int firstIndex = ArrayFirstIndex(arr,0,data);
		System.out.println("Array First Index "+data+"="+firstIndex);
		sc.close();
	}

	private static int ArrayFirstIndex(int[] arr, int idx, int data) {
	
		if(idx == arr.length)
		{
			return -1;
		}
		
		int fisma = ArrayFirstIndex(arr,idx+1,data);
		if(arr[idx]==data)
		{
			return idx;
		}
		else {
			return fisma;
		}
		
	}
}
