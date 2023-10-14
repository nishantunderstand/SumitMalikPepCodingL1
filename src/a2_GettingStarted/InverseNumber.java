package a2_GettingStarted;

public class InverseNumber {
	public static void main(String[] args) {
		int n = 21453;
		int n1 = n;
		int op = 1;
		int od = 0;
		int inv = 0;
		int ip, id;
		while (n > 0) {
			od = n % 10;
			ip = od;
			id = op;
			inv = inv + id * (int) Math.pow(10, ip - 1);
			n = n / 10;
			op++;

		}
		System.out.println(n1);
		System.out.println(inv);
	}

}
