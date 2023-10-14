package d_OopsSwapPepcoding;

public class OopsSwapGamePropNew2 {
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
		System.out.println("After Swap new object is created at Top : ");
		p1.sayHi();
		p2.sayHi();

		swap2(p1, p2);
		System.out.println("After Swap new object is created at Bottom : ");
		p1.sayHi();
		p2.sayHi();

		swap3(p1, p2);
		System.out.println("After Swap new object is created in Mid Name Above Age Below : ");
		p1.sayHi();
		p2.sayHi();

		swap4(p1, p2);
		System.out.println("After Swap new object is created in Mid Name Below Age Above : ");
		p1.sayHi();
		p2.sayHi();
	}

	private static void swap1(Person p1, Person p2) {
		p1 = new Person();
		p2 = new Person();

		String tempname = p1.name;
		p1.name = p2.name;
		p2.name = tempname;

		int tempage = p1.age;
		p1.age = p2.age;
		p2.age = tempage;

	}

	private static void swap2(Person p1, Person p2) {
		String tempname = p1.name;
		p1.name = p2.name;
		p2.name = tempname;

		int tempage = p1.age;
		p1.age = p2.age;
		p2.age = tempage;

		p1 = new Person();
		p2 = new Person();

	}

	private static void swap3(Person p1, Person p2) {
		String tempname = p1.name;
		p1.name = p2.name;
		p2.name = tempname;

		p1 = new Person();
		p2 = new Person();

		int tempage = p1.age;
		p1.age = p2.age;
		p2.age = tempage;

	}

	private static void swap4(Person p1, Person p2) {
		int tempage = p1.age;
		p1.age = p2.age;
		p2.age = tempage;

		p1 = new Person();
		p2 = new Person();

		String tempname = p1.name;
		p1.name = p2.name;
		p2.name = tempname;

	}
}
