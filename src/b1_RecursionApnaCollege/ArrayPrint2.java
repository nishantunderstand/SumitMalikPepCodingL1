package b1_RecursionApnaCollege;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrint2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Length :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		displayArr(arr,n);
		sc.close();
	}

	private static void displayArr(int[] arr, int idx) {
		if(idx<0)
		{
			return;
		}
		
		displayArr(arr,idx-1);
		System.out.println(arr[idx]);
		
		
	}


}
