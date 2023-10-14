package a2_GettingStarted;

public class NumberReverse1 {
	public static void main(String[] args) {
		int num = 5432;
		int revnum = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			revnum = revnum * 10 + rem;
		}
		System.out.println(revnum);
	}
}
