package f1_HashMap;

import java.util.HashMap;

public class HighestFrequencyCharacterHashMap2 {
	public static void main(String[] args) {
		String str = "aabbccc";
		HashMap<Character, Integer> hmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (hmap.containsKey(ch)) {
				int of = hmap.get(ch);
				int nf = of + 1;
				hmap.put(ch, nf);
			} else {
				hmap.put(ch, 1);
			}
		}
		System.out.println("HashMap:" + hmap);
		char MaxOccChar = str.charAt(0);
		System.out.println("Assumed Maximium Occurence Character : " + MaxOccChar);
		for (Character key : hmap.keySet()) {
			if (hmap.get(key) > hmap.get(MaxOccChar))
				MaxOccChar = key;
		}
		System.out.println("Maximium Occurence Character : " + MaxOccChar);

	}
}
