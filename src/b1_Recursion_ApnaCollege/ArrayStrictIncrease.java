package b1_Recursion_ApnaCollege;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStrictIncrease 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Length :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Your Entered Arrays : "+Arrays.toString(arr));
		boolean ans = StrictIncrease(arr,0);
		System.out.println("Array is Strictly Increasing  : "+ans);
		sc.close();
	}

	public static boolean StrictIncrease(int[] arr, int idx)
	{
		if(idx==arr.length-1)
		{
			return true;
		}
		
		if(arr[idx]<arr[idx+1])
		{
			return StrictIncrease(arr,idx+1);
		}
		else {
			return false;
		}
		

	}
}
