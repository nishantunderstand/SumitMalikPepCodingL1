package a7a_String_ScienteachEasy;

import a7a_String_SumeetMalik.Student;

public class ImmutableDemo {
	public static void main(String[] args) {
		Student st = new Student("Aman", 1);
		String name = st.getName();
		int roll = st.getRollNo();
		System.out.println("Name :" + name);
		System.out.println("Roll :" + roll);

	}

}
