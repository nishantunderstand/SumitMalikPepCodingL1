package a7c_ArrayList;

import java.util.ArrayList;

public class ArrayListRemoveBasic {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(10);
		aList.add(20);
		aList.add(30);
		aList.add(40);
		aList.add(50);
		aList.add(60);
		aList.add(70);
		aList.add(80);
		aList.add(90);
		aList.add(100);
		System.out.println(aList);
		aList.remove(aList.get(5));
		System.out.println(aList);
	}
}
