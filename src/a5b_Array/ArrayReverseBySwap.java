package a5b_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseBySwap {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Length :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Values for Array :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Your Entered Arrays : "+Arrays.toString(arr));
		ArrayReverseBySwap(arr);
		sc.close();
	}

	private static void ArrayReverseBySwap(int[] arr) {
		/*
		 * int i = arr[0]; int j = arr[arr.length-1]; 
		 */
		// Pointer have to 1st Place
		int i = 0;
		int j = arr.length-1;
		
		while(i<=j) {
			int temp = arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			i++;
			j--;
		}
		System.out.println("Reversed Arrays :"+Arrays.toString(arr));
	}
}
