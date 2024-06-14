package f1_HashMap;

import java.util.HashMap;

/** 
 * Can we use char,int for declaration ?
*/
public class HighestFrequencyCharacterHashMap2 {
	public static void main(String[] args) {
		String str = "aabbbaaaccccdddd";
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(hm.containsKey(ch)){
				int of=hm.get(ch);
				int nf = of+1;
				hm.put(ch,nf);
			}else{
				hm.put(ch,1);
			}
		}
		char MaxOccChar = str.charAt(0);
		for(Character iKey : hm.keySet()){
			if(hm.get(iKey)>hm.get(MaxOccChar)){
				MaxOccChar=iKey;
			}
		}
		System.out.println("HashMap"+hm);
		System.out.println("Maximum Occurence : "+MaxOccChar +"Count :"+hm.get(MaxOccChar));
	}
}
