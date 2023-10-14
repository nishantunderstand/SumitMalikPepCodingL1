package d_OopsSwapPepcoding;

public class OopsSwapGamePropNew {
	public static class Person {
		int age;
		String name;

		void sayHi() {
			System.out.println(name + "[" + age + "] says Hii");
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 1;
		p1.name = "A";
		Person p2 = new Person();
		p2.age = 2;
		p2.name = "B";
		System.out.println("Before Swap");
		p1.sayHi();
		p2.sayHi();
		swap1(p1, p2);
		System.out.println("After Swap");
		p1.sayHi();
		p2.sayHi();
	}

	private static void swap1(Person p1, Person p2) {// Person is a Data Type
		p1 = new Person();
		p2 = new Person();
		// Bring Age Code Here, Make some changes

		String tempname = p1.name;
		p1.name = p2.name;
		p2.name = tempname;

		// p1 = new Person();
		// p2 = new Person();

		int tempage = p1.age;
		p1.age = p2.age;
		p2.age = tempage;

		// Bring Name Code Here, Make some Changes

		// p1 = new Person();
		// p2 = new Person();
	}
}
