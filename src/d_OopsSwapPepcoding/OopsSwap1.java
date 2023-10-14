package d_OopsSwapPepcoding;

public class OopsSwap1 {
	private int age;
	private String name;

	private void sayHi() {
		System.out.println("age: " + age + " \t name: " + name);
	}

	public static void main(String[] args) {
		System.out.println("Program is Running...");
		// Can we call constructor ? Just like Method
		OopsSwap1 osw = new OopsSwap1();
		osw.age = 10;
		osw.name = "Aman";
		osw.sayHi();
	}
}