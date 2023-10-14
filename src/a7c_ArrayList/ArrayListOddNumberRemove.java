package a7c_ArrayList;

import java.util.ArrayList;

public class ArrayListOddNumberRemove {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(8);
		aList.add(14);
		aList.add(9);
		aList.add(17);
		aList.add(8);
		aList.add(6);
		aList.add(42);
		System.out.println(aList);

		for (int i = 0; i < aList.size(); i++) {
			if (isOdd(aList.get(i)) == true) {
				aList.remove(i);
			}
		}

		System.out.println(aList);
	}

	private static boolean isOdd(int val) {

		if (val % 2 == 0) {
			return false;
		}
		return true;
	}
}
