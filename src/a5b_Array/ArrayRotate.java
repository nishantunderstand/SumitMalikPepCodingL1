package a5b_Array;
import java.util.Scanner;

public class ArrayRotate 
{

	public static void main(String[] args) 
	{
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Number of Element to be Inserted");
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Value :"+i);
			arr[i]=scn.nextInt();
		}
		
		System.out.println("From which Index you want to Rotate Array :");
		int k = scn.nextInt();
		
		System.out.println("Your Entered Array :");
		display(arr);
		rotate(arr,k);
		System.out.println("\n Your Rotated Array :");
		display(arr);
		scn.close();
	}

	private static void rotate(int[] arr, int k) {
		k = k % 10;
		if(k<0)
		{
			k +=arr.length;
		}
		
		//Part 1
		reverse(arr, 0,arr.length-k-1);
		//Part 2
		reverse(arr, arr.length-k, arr.length-1);
		//Part All
		reverse(arr, 0, arr.length-1);
	}

	private static void display(int[] arr) 
	{
		for(int i:arr)
		{
			System.out.print(i+"\t");
		}
		
	}

	private static void reverse(int[] arr,int i, int j) 
	{
		int li=i;
		int ri=j;
		while(li<=ri) 
		{
			int temp =arr[li];
			arr[li]=arr[ri];
			arr[ri]=temp;
			li++;
			ri--;
		}
		
	}

}
