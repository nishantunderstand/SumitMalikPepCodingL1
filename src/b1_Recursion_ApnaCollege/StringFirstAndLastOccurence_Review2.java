package b1_Recursion_ApnaCollege;

/**
 * 1. Empty Input
 * 2. Single Character String
 * 3. Character Not Present
 * 4. Character Present at Beginning
 * 5. Character Present at End
 * 6. All Characters Same
 * 7. Mixed Characters
 * 8. Case Sensitivity
 */

public class StringFirstAndLastOccurence_Review2 {
	public static void main(String[] args) {
		String str = "gaabbddcccdg";
		char resCh = 'g';

		int firstIdx = -1;
		int lastIdx = -1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == resCh && firstIdx == -1) {
				firstIdx = i;
			} else if (str.charAt(i) == resCh && firstIdx != -1) {
				lastIdx = i;
			}
		}
		System.out.println("String :" + str);
		System.out.println("Char to find : " + resCh);

		if (firstIdx != -1) {
			System.out.println("First Idx:" + firstIdx);
		}
		if (lastIdx != -1) {
			System.out.println("Last Idx:" + lastIdx);
		} else {
			System.out.println("!!!Element is Present Once Only!!!");
		}
	}
}
