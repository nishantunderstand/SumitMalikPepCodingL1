package a7a_StringSumitMalik;

public class StringReverseByStringBuider {
	public static void main(String[] args) {
		String string = new String("hello");
		StringBuilder stringBuilder = new StringBuilder(string);
		stringBuilder.reverse();
		System.out.println("Original String :" + string);
		System.out.println("Reversed String by String Builder :" + stringBuilder);
	}

}
