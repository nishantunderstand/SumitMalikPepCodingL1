package a5b_Array;

import java.util.Scanner;

public class ArrayElementFind {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		System.out.println("Number of Element to be inserted in Array");
		int n = scn.nextInt();
		System.out.println("Enter the Element in the Array");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Element which you want to search");
		int data = scn.nextInt();
		int index = -1;
		// Why do we need use break?
		// Why cannot we use if-else statement?
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				index = i;
				break;
				// return;
				// Why do i need to break this program? Or return ? As Per SumitMalik
			}
		}
		if (index == -1) {
			System.out.println("Unable to find element : " + data);
		} else {
			// System.out.println("Position:" + index + 1);
			System.out.print("Position:"); // <-- Output Print Mistake
			System.out.println(index + 1);
		}
		scn.close();
	}

}
