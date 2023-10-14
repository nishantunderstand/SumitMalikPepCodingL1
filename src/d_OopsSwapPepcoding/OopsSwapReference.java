package d_OopsSwapPepcoding;

public class OopsSwapReference {
	public static class Person {
		int age;
		String name;

		void sayHi() {
			System.out.println(name + "[" + age + "] says Hii");
		}
		// Why not create Instance Class? Used in the Static Class, Static - Static OKAY
		// Refer OopsSwapClass
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "A";
		Person p2 = new Person();
		p2.age = 11;
		p2.name = "B";
		System.out.println("Before Swap");
		p1.sayHi();
		p2.sayHi();
		swap1(p1, p2); // <--
		System.out.println("After Swap");
		p1.sayHi();
		p2.sayHi();
	}

	private static void swap1(Person p1, Person p2) {// Person is a Data Type
		Person temp = p1; 
		// int temp <-- WRONG
		p1 = p2; 
		// Reference Variables
		p2 = temp;
	}

}
