package d_OopsSwapPepcoding;

public class OopsSwapClass {
		int age;
		String name;

		void sayHi() {
			System.out.println(name + "[" + age + "] says Hii");
		}

	public static void main(String[] args) {
		OopsSwapClass p1 = new OopsSwapClass();
		p1.age = 10;
		p1.name = "A";
		OopsSwapClass p2 = new OopsSwapClass();
		p2.age = 11;
		p2.name = "B";
		System.out.println("Before Swap");
		p1.sayHi();
		p2.sayHi();
		swap1(p1, p2); // <--
		// Will Value be changed at the end ?? Yes Or No
		System.out.println("After Swap");
		p1.sayHi();
		p2.sayHi();
	}

	private static void swap1(OopsSwapClass p1, OopsSwapClass p2) {
		// Person is a Data Type
		OopsSwapClass temp = p1; // int temp <-- WRONG
		p1 = p2; // Reference Variables
		p2 = temp;
	}

}
