package a7c_ArrayList;

import java.util.ArrayList;

public class ArrayListPrimeNumberRemove {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(3);
		aList.add(12);
		aList.add(13);
		aList.add(15);
		System.out.println(aList);
		// Refer ArrayListOddNumberProgram
		for (int i = aList.size() - 1; i >= 0; i--) {
			int val = aList.get(i);
			if (isPrime(val) == true) {
				aList.remove(i);
			}
		}
		System.out.println(aList);
	}

	private static boolean isPrime(int val) {
		for (int div = 2; div * div <= val; div++) {
			if (val % div == 0) {
				return false;
			}
		}
		return true;
	}
}
