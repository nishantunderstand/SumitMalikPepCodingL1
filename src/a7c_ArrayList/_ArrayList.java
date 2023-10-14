package a7c_ArrayList;

import java.util.ArrayList;

public class _ArrayList {
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

		System.out.println("By For Loop");
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}
		System.out.println("By Foreach Loop By Integer");
		for (Integer i : aList) {
			System.out.println(i);
		}
		System.out.println("By Foreach Loop By int");
		for (int i : aList) {
			System.out.println(i);
		}
		// Which one is correct Option ?
		// int or Integer
	}
}
