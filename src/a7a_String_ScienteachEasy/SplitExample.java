package a7a_String_ScienteachEasy;

public class SplitExample {
	public static void main(String[] args) {
		String str3 = "Hello-Wo-rld-Java";
		String[] arr3 = str3.split("-", 1);
		for (String i : arr3) {
			System.out.println(i);
		}
	}
}

// Split can be Postive , Negative , Zero

/*
 * // Splitting based on digits //String[] arr = str.split("\\d+");
 * 
 * // Displaying the result //System.out.println("Splitting without limit:");
 * for (String s : arr) { System.out.println(s); }
 */

/*
 * String str = "Hello123World456Java"; String[] arr1 = str.split("\\d+"); for
 * (String i : arr1) { System.out.println(i); }
 */

/*
 * String str2 = "Hello-Wo-rld-Java"; String[] arr2 = str2.split("-"); for
 * (String i : arr2) { System.out.println(i); }
 * System.out.println(Arrays.toString(arr2));
 */