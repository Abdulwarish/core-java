package InterviewProgran;

public class Palindromnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem, res = 0, no = 12321, c = no;

		while (no > 0) {
			rem = no % 10;
			res = res * 10 + rem;
			no = no / 10;
		}
		if (c == res)
			System.out.println("Palindrom number");
		else
			System.out.println("not PAlindorm number");
	}

}
