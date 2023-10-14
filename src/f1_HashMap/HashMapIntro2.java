package f1_HashMap;

import java.util.HashMap;

public class HashMapIntro2 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();

		// hm.put('A', 11);
		hm.put("A", 11);

		hm.put("A", 12);
		System.out.println(hm);
		hm.put("B", 12);
		System.out.println(hm);
		Integer key = hm.get("A1");
		System.out.println(key);

	}

}
