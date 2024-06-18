package a7a_String_ScienteachEasy;

public class StringCharacterGet {
	public static void main(String[] args) {
		String str = new String();
		str = "Hello";
		System.out.println("String :" + str);
		System.out.println("String Length : " + str.length());
		System.out.println(str.charAt(3));
		System.out.println("String Input Data ");
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

}
