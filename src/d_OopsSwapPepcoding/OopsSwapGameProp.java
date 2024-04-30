package d_OopsSwapPepcoding;

/**
 * 
 * {@link OopsSwapClass}
 */
public class OopsSwapGameProp {
	
	public static class Person {
		int age;
		String name;

		void sayHi() {
			System.out.println(name + "[" + age + "] says Hii");
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "A";
		Person p2 = new Person();
		p2.age = 20;
		p2.name = "B";
		System.out.println("Before Swap");
		p1.sayHi();
		p2.sayHi();
		swap1(p1, p2);
		System.out.println("After Swap");
		p1.sayHi();
		p2.sayHi();
	}

	private static void swap1(Person p1, Person p2) {
		
		// Person is a Data Type
		// Swapping Values
		// Will Value be changed at the end ?? Yes Or No
		
		int tempage = p1.age;
		// If you don't want to change tempage, then you need to change age declared variable
		// But Changing age to Person will , generate more error, So it is better to convert to Primitive Data type.
		p1.age = p2.age;
		p2.age = tempage;

		String tempname = p1.name;
		p1.name = p2.name;
		p2.name = tempname;
	}
}
