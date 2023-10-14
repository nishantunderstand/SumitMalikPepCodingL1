package a7c_ArrayList;

import java.util.ArrayList;

public class ArrayListBasic {
	public static void main(String[] args) {
		// ArrayList<Integer> arList = new ArrayList()<>; //WRONG
		// ArrayList<Integer> arList = new ArrayList<>(); // Correct, More Correct

		ArrayList<Integer> arList = new ArrayList();
		// ArrayList arList = new ArrayList(); // Error Will Come, Reason UnKnown
		arList.add(20);
		arList.add(23);
		arList.add(24);
		arList.add(25);
		System.out.println("ArrayList -> " + arList + " size :" + arList.size());
		arList.add(30);
		System.out.println("ArrayList -> " + arList + " size :" + arList.size());
		arList.remove(1);
		System.out.println("ArrayList -> " + arList + " size :" + arList.size());
		arList.set(0, 200);
		System.out.println("ArrayList -> " + arList + " size :" + arList.size());
		int val = arList.get(2);
		System.out.println("Val :" + val);

		for (int i : arList) {
			System.out.println(i);
		}
		for (int i : arList) {
			System.out.print(i + "\t");
		}

	}

}
