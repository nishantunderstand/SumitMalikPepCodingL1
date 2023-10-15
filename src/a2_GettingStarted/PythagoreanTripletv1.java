package a2_GettingStarted;

public class PythagoreanTripletv1 {

	public static void main(String[] args) {
		int a = 5;
		int b = 12;
		int c = 14;

		int hyp = 0;
		int per = 0;
		int base = 0;

		if (a > b && a > c) {
			hyp = a;
			per = b;
			base = c;
		} else if (b > a && b > c) {
			hyp = b;
			per = a;
			base = c;
		} else {
			hyp = c;
			per = a;
			base = b;
		}

		if (hyp * hyp == per * per + base * base) {
			System.out.println("Pythagoren Triplet");
		} else {
			System.out.println("Not Pythagoren Triplets");
		}
	}

}
