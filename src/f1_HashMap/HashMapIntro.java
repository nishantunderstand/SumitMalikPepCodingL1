package f1_HashMap;

import java.util.HashMap;
import java.util.Set;
public class HashMapIntro {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		// hm.put('A', 13); // Issue is Single Quote, String is represented by Double Quotes
		hm.put("A", 11);
		hm.put("A", 12);
		System.out.println(hm);
		hm.put("B", 12);
		System.out.println(hm);
		
		System.out.println("Get Single Keys");
		Integer key = hm.get("A");
		System.out.println(key);

		System.out.println("Checking Keys");
		boolean isKeyPresent = hm.containsKey("A");
		System.out.println(isKeyPresent);

		System.out.println("Checking KeySet");
		Set<String> keyString = hm.keySet();
		System.out.println(keyString);

		System.out.println("Keys-Value by For Each Loop");
		for(String ikey:hm.keySet()){
			Integer val = hm.get(ikey);
			System.out.println(ikey+":"+val);
		}
	}
}
