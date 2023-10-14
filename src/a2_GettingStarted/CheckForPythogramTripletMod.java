package a2_GettingStarted;

public class CheckForPythogramTripletMod {
	public static void main(String[] args) {
		int a = 12;
		int b = 11;
		int c = 5;
		int hyp = Math.max(Math.max(a, b), c);
		int per, base;
		if (hyp == a) {
			per = b;
			base = c;
		} else if (hyp == b) {
			per = c;
			base = a;
		} else {
			per = a;
			base = b;
		}
		if (hyp * hyp == per * per + base * base) {
			System.out.println("Yes Pythoagorem Triplet!!!!");
		} else {
			System.out.println("Not Pythograme Triplet!!!!!");
		}

	}
}
