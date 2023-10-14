package b1_Recursion;

public class NumberDescPrint2 {

	public static void main(String[] args) {
		int n = 10;
		prinNumDesc(n);

	}

	public static void prinNumDesc(int num) {
		if (num == 0) {
			return;
		}
		System.out.println(num);
		prinNumDesc(num - 1);
	}

}
