package _year2024;

/**
 * Primitive doesn't have this kind of method
 * Primitive convert into object
 * Then we have 
 */
public class PrintPrimitiveDataType {
	public static void main(String[] args) {
		String str = "Hello";
		char ch = str.charAt(0);
		//System.out.println((ch).getClass().getName());
		System.out.println(((Object)ch).getClass().getName());
		System.out.println("Is this working is my Local!!!");
		
	}

}
