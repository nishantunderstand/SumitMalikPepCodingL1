package b1_RecursionSumitMalik;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsetOfnNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Number :");
		int n = scanner.nextInt();
		System.out.println("Your Entered Number : " + n);
		ArrayList<Integer> aList = new ArrayList<>();
		SubsetOfnNumbers(n, aList);
		scanner.close();
	}

	private static void SubsetOfnNumbers(int n, ArrayList<Integer> aList) {
		if (n <= 0) {
			System.out.print("Subset:");
			printSubset(aList);
			return;
		}
		// Element Added
		aList.add(n);
		SubsetOfnNumbers(n - 1, aList);
		// Element Not Added
		aList.remove(aList.size() - 1);
		SubsetOfnNumbers(n - 1, aList);
	}

	private static void printSubset(ArrayList<Integer> aList) {
		for (int i = 0; i < aList.size(); i++) {
			System.out.print(aList.get(i));
		}
		System.out.println();
	}

}

/*
 * 
 * private static void printSubset(ArrayList<Integer> aList) { for (int i =
 * aList.size() - 1; i >= 0; i--) { System.out.print(aList.get(i)); }
 * System.out.println(); }
 * 
 * 
 * Just reserve the order of output
 */