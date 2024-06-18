package b1_Recursion_ApnaCollege;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Length :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Your Entered Array : "+Arrays.toString(arr));
		displayArr(arr,0);
		sc.close();
	}

	private static void displayArr(int[] arr, int idx) {
		if(idx==arr.length)
		{
			return;
		}
		
		System.out.println(arr[idx]);
		displayArr(arr,idx+1);
		
	}


}