package a7c_ArrayList;

import java.util.ArrayList;

public class ArrayListString {
	public static void main(String[] args) {
		ArrayList<String> alstr = new ArrayList<>();
		alstr.add("A");
		alstr.add("Ab");
		alstr.add("Aq");
		alstr.add("Aqq");
		alstr.add("Ahh");
		alstr.add("Aqqq");
		System.out.println(alstr);

		// For Loops
		System.out.println("Printing by For Loops:");
		for (int i = 0; i < alstr.size(); i++) {
			String valLoops = alstr.get(i);
			System.out.println(valLoops);
		}

		// Foreach Loops
		System.out.println("Printing by ForEach Loops:");
		for (String val1 : alstr) {
			System.out.println(val1);
		}
		for (String s1 : alstr) {
			System.out.println(s1);
		}
		System.out.println();
	}

}
