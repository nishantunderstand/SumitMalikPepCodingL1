package b1_Recursion_ApnaCollege;

/**
 */

public class RemoveConsecutiveDuplicateInStringbySwitch {
	public static void main(String[] args) {
		String str = "234";
		int length = str.length();
		switch (length) {
		case 0:
			System.out.println("Length Less than Zero");
			System.out.println("Try again");
			break;
		case 1:
			System.out.println("Length Exaclty 1");
			System.out.println(str);
			break;
		default:
			if(str.matches("[0-9]+")) {
				System.out.println("Try Again String With String Input"+str);
				 //throw new IllegalArgumentException("String contains non-digit characters.");
            }
				
			
		else {
				String result = removeConsecutiveDuplicate(str, 0);
				System.out.println("Original String : " + str);
				System.out.println("After Removed :" + result);

			}
			
		}
	}

	

	private static String removeConsecutiveDuplicate(String str, int i) {
		System.out.println("Testing 123");
		return null;
	}
}
