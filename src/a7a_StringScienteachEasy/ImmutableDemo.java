package a7a_StringScienteachEasy;

import a7a_StringSumitMalik.Student;

public class ImmutableDemo {
	public static void main(String[] args) {
		Student st = new Student("Aman", 1);
		String name = st.getName();
		int roll = st.getRollNo();
		System.out.println("Name :" + name);
		System.out.println("Roll :" + roll);

	}

}
